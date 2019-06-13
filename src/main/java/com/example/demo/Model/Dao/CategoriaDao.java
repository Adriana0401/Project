package com.example.demo.Model.Dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Categoria;

@Repository
@Transactional
public class CategoriaDao extends AbstractDao<Categoria, Integer> {

	@Override
	protected void setClassT() {
		classT = Categoria.class;

	}

	@Override
	protected void setK() {
		classK = Integer.class;
	}

}
