package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.PagamentoDAO;
import br.com.fiap.entity.Pagamento;
import br.com.fiap.generics.GenericDAOimpl;

public class PagamentoDAOimpl extends GenericDAOimpl<Pagamento, Integer> implements PagamentoDAO{

	public PagamentoDAOimpl(EntityManager em) {
		super(em);
		
	}

}
