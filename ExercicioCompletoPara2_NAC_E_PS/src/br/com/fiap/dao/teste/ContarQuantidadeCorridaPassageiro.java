package br.com.fiap.dao.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.CorridaDAOimpl;
import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;

public class ContarQuantidadeCorridaPassageiro {
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();
		
		CorridaDAO cDAO = new CorridaDAOimpl(em);
		System.out.println(cDAO.QuantidadeCorridaPorPassageiro(1));
		
		em.close();
		fa.close();
		
	}
}
