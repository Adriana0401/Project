package com.example.demo.Model.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Categoria;
import com.example.demo.Model.ProdottoDTO;

@Repository
@Transactional
public class ImpaginazioneDao extends AbstractDao {

	@PersistenceContext
	private EntityManager entity;

	@Override
	protected void setClassT() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setK() {
		// TODO Auto-generated method stub

	}

	@Autowired
	CategoriaDao categoriadao;

	// NAVIGAZIONE

	int lunghezzaPag = 3;
	int paginaAttuale = 1;

	public int getLunghezza() {
		return lunghezzaPag;
	}

	public int calcoloOffset() {
		return (paginaAttuale - 1) * lunghezzaPag;
	}

	// METODO LETTURA RIGA
	public Long getNumRiga() {

		String sql = "SELECT COUNT(*) AS prodotti from Prodotto";
		Long i = null;
		try {
			javax.persistence.Query query = entity.createQuery(sql);
			i = (Long) query.getSingleResult();

		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return i;
	}

	// TOTALE PAGINE

	public int totPagine() {
		return (int) Math.ceil(getNumRiga() / (double) lunghezzaPag);
	}

	// LETTURA PAGINE

	public ArrayList<ProdottoDTO> leggiPagina() {
		ArrayList<ProdottoDTO> prodottodto = new ArrayList<>();
		int offset;
		try {
			offset = calcoloOffset();
			Query query = (Query) entity.createNativeQuery("select foto ,descrizione , "
					+ "p.nome, prezzo, id_categoria,p.id_prodotto from prodotti p ,"
					+ " prodotti_listini pl , listini l where p.id_prodotto = pl.id_prodotto and pl.id_listino ="
					+ " l.id_listino and l.attivo = true order by id_prodotto ASC limit 3 offset ?");
			query.setParameter(1, offset);
			List<Object[]> lista = query.getResultList();
			for (Object[] obj : lista) {
				Categoria categoria = new Categoria();
				ProdottoDTO pd = new ProdottoDTO();
				pd.setNome(obj[2].toString());
				pd.setDescrizione(obj[1].toString());
				pd.setPrezzo(Integer.parseInt(obj[3].toString()));
				pd.setIdProdotto(Integer.parseInt(obj[5].toString()));
				pd.setFoto(obj[0].toString());
				categoria.setId(Integer.parseInt(obj[4].toString()));
				Categoria c = categoriadao.readByKey(categoria.getId());
				pd.setCategoria(c);
				prodottodto.add(pd);
			}

		} catch (NoResultException e) {
			e.printStackTrace();
		}

		return prodottodto;
	}

	// PRIMA PAGINA E ULTIMA

	public ArrayList<ProdottoDTO> primaPag() {
		paginaAttuale = 1;
		return leggiPagina();
	}

	public ArrayList<ProdottoDTO> ultimaPag() {
		paginaAttuale = totPagine();
		return leggiPagina();
	}

	// PAGINA PRECEDENTE E SUCCESSIVA

	public ArrayList<ProdottoDTO> pagPrec() {
		if (paginaAttuale > 1) {
			paginaAttuale--;
		}
		return leggiPagina();
	}

	public ArrayList<ProdottoDTO> pagSucc() {
		int tt = totPagine();
		if (paginaAttuale < tt) {
			paginaAttuale++;
		}
		return leggiPagina();
	}

}
