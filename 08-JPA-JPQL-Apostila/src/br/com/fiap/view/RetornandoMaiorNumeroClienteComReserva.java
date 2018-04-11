package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.impl.ReservaDAOImpl;

public class RetornandoMaiorNumeroClienteComReserva {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			ReservaDAO rDAO = new ReservaDAOImpl(em);
			
			System.out.println(rDAO.RetornarClienteMaiorReserva());
			
		
	}

}
