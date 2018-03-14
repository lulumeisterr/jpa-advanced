package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.DAOtwo.NotaFiscal_DAO;
import br.com.fiap.jpa.entity.NotaFiscal;

public class NotaFiscalDAO_impl extends GenericDAOImpl<NotaFiscal, Integer> implements NotaFiscal_DAO{

	public NotaFiscalDAO_impl(EntityManager em) {
		super(em);
		
	}

}
