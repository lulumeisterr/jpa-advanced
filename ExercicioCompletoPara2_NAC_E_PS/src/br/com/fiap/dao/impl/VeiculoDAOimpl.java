package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.VeiculoDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.generics.GenericDAOimpl;

public class VeiculoDAOimpl extends GenericDAOimpl<Veiculo, Integer> implements VeiculoDAO{

	public VeiculoDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


}
