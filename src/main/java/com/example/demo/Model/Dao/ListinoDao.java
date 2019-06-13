package com.example.demo.Model.Dao;

import com.example.demo.Model.Listino;

public class ListinoDao extends AbstractDao<Listino, Integer> {

	@Override
	protected void setClassT() {
		classT = Listino.class;
	}

	@Override
	protected void setK() {
		classK = Integer.class;
	}

}
