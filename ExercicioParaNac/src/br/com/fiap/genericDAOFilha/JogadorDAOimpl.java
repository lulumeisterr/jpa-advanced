package br.com.fiap.genericDAOFilha;

import javax.persistence.EntityManager;

import br.com.fiap.ImplementacaoDAO.GenericDAOFather;
import br.com.fiap.entity.Jogador;

public class JogadorDAOimpl extends GenericDAOFather<Jogador, Integer>{

	public JogadorDAOimpl(EntityManager em) {
		super(em);
	}
}
