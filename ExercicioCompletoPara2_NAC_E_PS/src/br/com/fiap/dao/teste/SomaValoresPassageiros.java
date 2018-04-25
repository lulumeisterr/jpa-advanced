package br.com.fiap.dao.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.PassageiroDAOimpl;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.PassageiroDAO;

public class SomaValoresPassageiros {

	public static void main(String[] args) {

		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			PassageiroDAO pDAO = new PassageiroDAOimpl(em);
			
			System.out.println(pDAO.somarPagamentoPorPassageiro(1));
			
			em.close();
			fa.close();
	}
	

}
