package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Pacote> obterListaPacote(String nm_transporte) {
		
		//Query
		TypedQuery<Pacote> query = em.createQuery("from Pacote p where p.transporte.empresa = :n", Pacote.class);
		//Parametro
		query.setParameter("n" , nm_transporte);
		//Execução
		return query.getResultList();
	}

	@Override
	public List<Pacote> ListarTransporte(Transporte t) {
		return em.createQuery("from Pacote p where p.transporte = :n" , Pacote.class)
				.setParameter("n", t)
				.getResultList();
		
	}

	@Override
	public List<Pacote> ListarPorData(Calendar inicio , Calendar fim) {
		return em.createQuery("from Pacote p where p.dataSaida between :d and :n",Pacote.class)
				 .setParameter("d", inicio)
				 .setParameter("n", fim)
				 .getResultList();
	}
	

}
