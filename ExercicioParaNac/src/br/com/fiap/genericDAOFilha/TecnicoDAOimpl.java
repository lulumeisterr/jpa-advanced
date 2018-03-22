package br.com.fiap.genericDAOFilha;

import javax.persistence.EntityManager;

import br.com.fiap.ImplementacaoDAO.GenericDAOFather;
import br.com.fiap.entity.Tecnico;

public class TecnicoDAOimpl extends GenericDAOFather<Tecnico, Integer> {

	public TecnicoDAOimpl(EntityManager em) {
		super(em);
	}

}
