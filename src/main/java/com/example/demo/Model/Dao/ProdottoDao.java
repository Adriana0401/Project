package com.example.demo.Model.Dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Prodotto;

@Repository
@Transactional
public class ProdottoDao extends AbstractDao<Prodotto, Integer> {

//	@Autowired
//	CategoriaDao categoriadao;

	@PersistenceContext
	private EntityManager entity;

	@Override
	protected void setClassT() {
		classT = Prodotto.class;

	}

	@Override
	protected void setK() {
		classK = Integer.class;

	}

//	@SuppressWarnings("unchecked")
//	public ArrayList<ProdottoDTO> prodottodto () {
//		ArrayList<ProdottoDTO> prodottodto =new ArrayList<>();
//		try {
//			Query query = (Query) entity.createNativeQuery("select foto ,descrizione , "
//					+ "p.nome, prezzo, id_categoria,p.id_prodotto from prodotti p ,"
//					+ " prodotti_listini pl , listini l where p.id_prodotto = pl.id_prodotto and pl.id_listino ="
//					+ " l.id_listino and l.attivo = true");		
//			List<Object[]> lista = query.getResultList();
//			for(Object[] obj : lista) {
//			Categoria categoria = new Categoria();
//			ProdottoDTO pd = new ProdottoDTO();
//			pd.setNome(obj[2].toString());
//			pd.setDescrizione(obj[1].toString());
//			pd.setPrezzo(Integer.parseInt(obj[3].toString()));
//			pd.setIdProdotto(Integer.parseInt(obj[5].toString()));
//			pd.setFoto(obj[0].toString());
//			categoria.setId(Integer.parseInt(obj[4].toString()));
//			Categoria c = categoriadao.readByKey(categoria.getId());
//			pd.setCategoria(c);
//			prodottodto.add(pd);
//			}
//			
//			
//		}catch(NoResultException e) {
//			e.printStackTrace();	
//		}
//		
//
//		return prodottodto;
//		
//	}
//	
//	
//	
//	
//	
//	
//	

}
