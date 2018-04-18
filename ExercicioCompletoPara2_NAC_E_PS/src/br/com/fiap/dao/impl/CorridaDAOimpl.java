package br.com.fiap.dao.impl;

import br.com.fiap.entity.Corrida;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.generics.GenericDAOimpl;

public class CorridaDAOimpl extends GenericDAOimpl<Corrida, Integer> implements CorridaDAO{

	public CorridaDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
