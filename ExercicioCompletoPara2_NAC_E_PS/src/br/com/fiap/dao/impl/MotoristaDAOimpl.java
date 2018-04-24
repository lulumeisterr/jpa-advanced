package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.generics.GenericDAOimpl;

public class MotoristaDAOimpl extends GenericDAOimpl<Motorista, Integer> implements MotoristaDAO {

	public MotoristaDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


	/*
	 * 1. Buscar os motoristas por parte do nome:
			a. Parâmetros de entrada: Parte do nome do motorista;
			b. Máximo de resultados: 50;
			c. Retorno: Lista de motoristas;
	 * 
	 */

	@Override
	public List<Motorista> buscarPorNome(String nome) {
		// TODO Auto-generated method stub
		return em.createQuery("from Motorista m where m.nome like :n" , Motorista.class)
				.setParameter("n", "%" + nome + "%")
				.setMaxResults(50)
				.getResultList();
	}



}
