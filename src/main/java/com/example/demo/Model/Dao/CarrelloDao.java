package com.example.demo.Model.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.PersistenceException;
import javax.persistence.TransactionRequiredException;
import javax.transaction.Transactional;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Carrello;
import com.example.demo.Model.Carrello.Id;
import com.example.demo.Model.CarrelloDTO;
import com.example.demo.Model.Utente;

@Repository
@Transactional
public class CarrelloDao extends AbstractDao<Carrello, Integer> {

	@Autowired
	UtenteDao ud;

	@Override
	protected void setClassT() {
		classT = Carrello.class;
	}

	@Override
	protected void setK() {
		classK = Integer.class;

	}

	public Carrello readCarrello(int id_utente, int id_prodotto) {
		Carrello carrello = null;
		try {
			String hql = "FROM Carrello WHERE id_utente= :id_utente AND id_prodotto= :id_prodotto";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("id_utente", id_utente);
			query.setParameter("id_prodotto", id_prodotto);
			carrello = (Carrello) query.uniqueResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return carrello;
	}

	public int quantita(int id_utente, int id_prodotto) {
		int quantita = 0;
		try {
			String hql = "SELECT quantita FROM Carrello WHERE id_utente= :id_utente AND id_prodotto= :id_prodotto";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("id_utente", id_utente);
			query.setParameter("id_prodotto", id_prodotto);
			quantita = (int) query.uniqueResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return quantita;

	}

	public ArrayList<Carrello> utenteCarrello(int id_utente) {
		ArrayList<Carrello> carrello = null;
		try {
			String hql = "FROM Carrello WHERE id_utente= :id_utente";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("id_utente", id_utente);
			carrello = (ArrayList<Carrello>) query.getResultList();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return carrello;
	}

	public ArrayList<CarrelloDTO> carrello(int id) {
		ArrayList<CarrelloDTO> carrellodto = new ArrayList<>();
		try {
			Query query = (Query) entity
					.createNativeQuery("SELECT foto,descrizione,p.nome,prezzo,quantita,p.id_prodotto,acquistato from "
							+ "prodotti p,prodotti_listini pl,listini l ,carrello c, utenti u where "
							+ "p.id_prodotto=pl.id_prodotto and pl.id_listino = l.id_listino and c.id_prodotto=p.id_prodotto and "
							+ "u.id_utente= :id and l.attivo = true and c.id_utente = u.id_utente");
			query.setParameter("id", id);
			List<Object[]> lista = query.getResultList();
			for (Object[] obj : lista) {
				CarrelloDTO cdto = new CarrelloDTO();
				cdto.setFoto(obj[0].toString());
				cdto.setDescrizione(obj[1].toString());
				cdto.setNome(obj[2].toString());
				cdto.setPrezzo(Integer.parseInt(obj[3].toString()));
				cdto.setQuantita(Integer.parseInt(obj[4].toString()));
				cdto.setId_prodotto(Integer.parseInt(obj[5].toString()));
				cdto.setAcquistato(Boolean.parseBoolean(obj[6].toString()));
				cdto.setMoltiplicazione(cdto.getPrezzo() * cdto.getQuantita());
				carrellodto.add(cdto);
			}
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return carrellodto;

	}

	@Override
	public boolean elimina(Carrello carrello) {
		try {
			carrello.setId(new Id(carrello.getId().getId_prodotto(), carrello.getId().getId_utente()));

			entity.remove(entity.merge(entity.find(Carrello.class, carrello.getId())));

			return true;
		} catch (TransactionRequiredException tre) {
			tre.printStackTrace();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		return true;

	}
	
	
	

}
