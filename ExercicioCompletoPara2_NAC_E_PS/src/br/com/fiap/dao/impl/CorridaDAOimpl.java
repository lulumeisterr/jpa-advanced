package br.com.fiap.dao.impl;

import br.com.fiap.entity.Corrida;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.generics.GenericDAOimpl;

public class CorridaDAOimpl extends GenericDAOimpl<Corrida, Integer> implements CorridaDAO{

	public CorridaDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * 2. Buscar por todas as corridas por um intervalo de datas:
			a. Parâmetros de entrada: Data início e Data fim;
			b. Máximo de resultados: 30;
			c. Retorno: Lista de corridas.

	 * 
	 */
	
	@Override
	public List<Corrida> listagemData(Calendar inicio, Calendar fim) {
		return em.createQuery("from Corrida c where c.dataCorrida between :i and :f",Corrida.class)
				.setParameter("i", inicio)
				.setParameter("f", fim)
				.setMaxResults(30)
				.getResultList();
	}
	
	

}
