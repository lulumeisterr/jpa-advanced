package br.com.fiap.jpa.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.consultasPKS.ConsultaPK;
import br.com.fiap.jpa.dao.ConsultaDAO;
import br.com.fiap.jpa.entity.Consulta;

public class ConsultaDAOimpl extends GenericDAOImpl<Consulta , ConsultaPK> implements ConsultaDAO{

	public ConsultaDAOimpl(EntityManager em) {
		super(em);
	}
	
	

}
