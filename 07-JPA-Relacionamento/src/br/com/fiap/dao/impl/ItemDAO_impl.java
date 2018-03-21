package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.jpa.entity.ItemPedido;

public class ItemDAO_impl extends GenericDAOImpl<ItemPedido, Integer>{

	public ItemDAO_impl(EntityManager em) {
		super(em);
		
	}
	

}
