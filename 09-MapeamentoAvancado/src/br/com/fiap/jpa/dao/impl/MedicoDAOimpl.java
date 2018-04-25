package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.MedicoDAO;
import br.com.fiap.jpa.entity.Medico;

public class MedicoDAOimpl extends GenericDAOImpl<Medico, Integer> implements MedicoDAO{

	public MedicoDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
