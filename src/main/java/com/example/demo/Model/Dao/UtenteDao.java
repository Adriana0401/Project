package com.example.demo.Model.Dao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Ruolo;
import com.example.demo.Model.Utente;

@Repository
@Transactional
public class UtenteDao extends AbstractDao<Utente, Integer> {

	@Autowired
	BCryptPasswordEncoder cripta;

	@Override
	protected void setClassT() {
		classT = Utente.class;

	}

	@Override
	protected void setK() {
		classK = Integer.class;

	}

	public Utente utentePresente(Utente utente) {

		try {
			String hql = "FROM Utente WHERE email =: email";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("email", utente.getEmail());
			utente = (Utente) query.uniqueResult();
		} catch (NoResultException e) {
			e.printStackTrace();
		}
		return utente;
	}

	public Utente controlloUtente(Utente utente) {

		try {
			String hql = "FROM Utente WHERE email= :email AND password= :password";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("email", utente.getEmail());
			query.setParameter("password", utente.getPassword());
			utente = (Utente) query.uniqueResult();
		} catch (NoResultException e) {
			e.printStackTrace();

		}
		return utente;
	}

	public Utente readByUser(String email) {
		Utente utente = null;
		try {
			String hql = "FROM Utente WHERE email= :email";
			Query query = (Query) entity.createQuery(hql);
			query.setParameter("email", email); // "email" ---> :email //
			utente = (Utente) query.uniqueResult();
		} catch (NoResultException e) {
			e.printStackTrace();

		}

		return utente;
	}

	@Override
	public boolean inserimento(Utente utente) {

		Ruolo ruolo = new Ruolo();
		utente.setPassword(cripta.encode(utente.getPassword()));
		entity.persist(utente);
		entity.flush();
		entity.clear();
		return false;
	}

}
