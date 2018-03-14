package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.DAOtwo.Pedido_DAO;
import br.com.fiap.jpa.entity.Pedido;


public class PedidoDAO_impl extends GenericDAOImpl<Pedido, Integer> implements Pedido_DAO{

	public PedidoDAO_impl(EntityManager em) {
		super(em);
	
		
	}

}
