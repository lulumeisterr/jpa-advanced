package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.PassageiroDAO;
import br.com.fiap.entity.Passageiro;
import br.com.fiap.generics.GenericDAOimpl;

public class PassageiroDAOimpl extends GenericDAOimpl<Passageiro, Integer> implements PassageiroDAO{

	public PassageiroDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
