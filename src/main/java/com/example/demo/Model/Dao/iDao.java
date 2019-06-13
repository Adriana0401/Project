package com.example.demo.Model.Dao;

import java.util.ArrayList;

public interface iDao<T, K> {

	boolean inserimento(T Object);

	boolean modifica(T object);

	boolean elimina(T object);

	T readByKey(K key);

	ArrayList<T> readAll();

}
