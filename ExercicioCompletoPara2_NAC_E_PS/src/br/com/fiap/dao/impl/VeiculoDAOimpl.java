package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.VeiculoDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.generics.GenericDAOimpl;

public class VeiculoDAOimpl extends GenericDAOimpl<Veiculo, Integer> implements VeiculoDAO{

	public VeiculoDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


	
	/*
	 * 3. Buscar por todos os veículos por valor mínimo do ano:
			a. Parâmetros de entrada: ano mínimo do veículo;
			b. Retorno: Lista de veículos.
	 * 
	 */
	
	@Override
	public List<Veiculo> BuscarValorAnoMinimo(int Anomin) {
		return em.createQuery("from Veiculo v where v.Ano <= :n" , Veiculo.class).setParameter("n", Anomin).getResultList();
	}

	

}
