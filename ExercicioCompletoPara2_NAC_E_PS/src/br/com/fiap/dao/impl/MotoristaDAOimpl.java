package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.generics.GenericDAOimpl;

public class MotoristaDAOimpl extends GenericDAOimpl<Motorista, Integer> implements MotoristaDAO {

	public MotoristaDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
