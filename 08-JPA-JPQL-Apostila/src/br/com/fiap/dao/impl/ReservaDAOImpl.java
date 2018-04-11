package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva,Integer> implements ReservaDAO {

	public ReservaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	@Override
	public long ContarReserva(int id) {
		return em.createQuery("select count(r) from Reserva r where r.cliente.id = :n" , Long.class).setParameter("n", id)
																								 .getSingleResult();
	}

	@Override
	public long contarPorDatas(Calendar inicio, Calendar fim) {
		return em.createNamedQuery("Reserva.contarPorData" , Long.class).setParameter("i",inicio)
																		.setParameter("f", fim).getSingleResult();
	}

	@Override
	public long RetornarClienteMaiorReserva() {
		return em.createNamedQuery("RetornarClienteMaiorReserva" , Long.class).getSingleResult();
	}


}
