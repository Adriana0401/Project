package com.example.demo.Model.Dao;

import java.util.ArrayList;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TransactionRequiredException;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractDao<T, K> implements iDao<T, K> {

	@PersistenceContext
	protected EntityManager entity;

	protected Class<T> classT;

	protected abstract void setClassT();

	protected Class<K> classK;

	protected abstract void setK();

	public AbstractDao() {
		super();
		this.setClassT();
		this.setK();
	}

	public boolean inserimento(T object) {
		try {
			entity.persist(object);
			entity.flush();
			return true;
		} catch (TransactionRequiredException tre) {
			tre.printStackTrace();
		} catch (EntityExistsException eee) {
			eee.printStackTrace();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		return false;
	}

	public boolean modifica(T object) {
		try {
			entity.merge(object);
			entity.flush();
			return true;
		} catch (TransactionRequiredException tre) {
			tre.printStackTrace();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		return false;
	}

	public boolean elimina(T object) {
		try {
			entity.remove(entity.merge(object));
			entity.flush();
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

	public T readByKey(K key) {
		try {
			System.out.println(classT);
			T oggettoDaTrovare = entity.find(classT, key);
			return oggettoDaTrovare;
		} catch (TransactionRequiredException tre) {
			tre.printStackTrace();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		return null;
	}

	public ArrayList<T> readAll() {
		try {
			ArrayList<T> genericList = (ArrayList<T>) entity.createQuery("FROM " + classT.getName()).getResultList();
			return genericList;
		} catch (IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		return null;
	}

}
