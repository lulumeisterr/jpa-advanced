package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.PacienteDAO;
import br.com.fiap.jpa.entity.Paciente;

public class PacienteDAOimpl extends GenericDAOImpl<Paciente, Integer> implements PacienteDAO{

	public PacienteDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
