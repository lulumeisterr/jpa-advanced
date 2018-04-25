package br.com.fiap.dao.impl;

import br.com.fiap.entity.Corrida;
import br.com.fiap.entity.Motorista;

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


	/*
	 * 4. Buscar por todas as corridas de um motorista:
		a. Parâmetros de entrada: objeto motorista;
		b. Retorno: Lista de corridas.

	 *
	 */

	@Override
	public List<Corrida> buscarPorCorrida(Motorista m) {
		return em.createQuery("from Corrida c where c.motorista = :d" , Corrida.class)
				.setParameter("d", m).getResultList();
	}


	/*
	 * 5. Contar a quantidade de corridas de um passageiro:
		a. Parâmetros de entrada: código do passageiro;
		b. Retorno: Quantidade de corridas.
	 * 
	 */
	
	@Override
	public long QuantidadeCorridaPorPassageiro(int qntd) {
		return em.createQuery("select count(c) from Corrida c where c.passageiro.codigo = :p" , Long.class)
				.setParameter("p", qntd).getSingleResult();
	}



}
