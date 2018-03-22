package br.com.fiap.genericDAOFilha;

import javax.persistence.EntityManager;

import br.com.fiap.ImplementacaoDAO.GenericDAOFather;
import br.com.fiap.entity.Time;
import br.com.fiap.jpa.dao.TimeDAO;

public class TimeDAOimpl extends GenericDAOFather<Time, Integer> implements TimeDAO{

	public TimeDAOimpl(EntityManager em) {
		super(em);
	}

}
