package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;

public class RetornandoFuncaoCount {

	public static void main(String[] args) {
		
		EntityManagerFactory fa =  EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			ClienteDAO c = new ClienteDAOImpl(em);
			
			System.out.println(c.contar());
			
			em.close();
			fa.close();
	}
	
}
