package br.com.fiap.genericDAOFilha;

import javax.persistence.EntityManager;

import br.com.fiap.ImplementacaoDAO.GenericDAOFather;

public class CampeonatoDAOimpl extends GenericDAOFather<CampeonatoDAOimpl, Integer> {

	public CampeonatoDAOimpl(EntityManager em) {
		super(em);
	}
}
