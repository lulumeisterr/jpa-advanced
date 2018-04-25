package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.daoInterface.PassageiroDAO;
import br.com.fiap.entity.Passageiro;
import br.com.fiap.generics.GenericDAOimpl;

public class PassageiroDAOimpl extends GenericDAOimpl<Passageiro, Integer> implements PassageiroDAO{

	public PassageiroDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

	
	/*
	 * 7. Somar todos os valores de pagamentos realizados por um passageiro:
a. Parâmetros de entrada: Código do passageiro;
b. Retorno: Soma do valor de todos os pagamentos.
	 * 
	 */
	
	@Override
	public double somarPagamentoPorPassageiro(int codigoPassageiro) {
		// TODO Auto-generated method stub
		return em.createQuery("select sum(p.ValuePay) from Pagamento p where p.corrida.codigo = :c" , 
				Double.class).setParameter("c" , codigoPassageiro).getSingleResult();
	}

}
