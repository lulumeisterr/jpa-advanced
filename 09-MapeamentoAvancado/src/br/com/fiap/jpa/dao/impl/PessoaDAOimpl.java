package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.entity.Pessoa;

public class PessoaDAOimpl extends GenericDAOImpl<Pessoa, Integer> implements PessoaDAO{

	public PessoaDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}



}
