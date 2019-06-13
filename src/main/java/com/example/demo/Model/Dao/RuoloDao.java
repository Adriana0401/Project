package com.example.demo.Model.Dao;

import javax.persistence.NoResultException;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Ruolo;


@Repository
@Transactional
public class RuoloDao extends AbstractDao<Ruolo, Integer>  {

	@Override
	protected void setClassT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void setK() {
		// TODO Auto-generated method stub
		
	}
	
	public Ruolo readByRole(String ruolo) {
		Ruolo ruolonew = null;
		try {
		String hql = "FROM Ruolo WHERE ruolo= :ruolo";
		Query query = (Query) entity.createQuery(hql);
		query.setParameter("ruolo", ruolo);               // "email" ---> :email //
		ruolonew = (Ruolo)query.uniqueResult();
		}catch(NoResultException e) {
			e.printStackTrace();
			
		}
		
		return ruolonew;
	}


}
