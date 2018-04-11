package br.com.fiap.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.ReservaDAOImpl;
import br.com.fiap.entity.Cliente;

public class QuantidadeReservaCliente {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			ClienteDAO cDAO = new ClienteDAOImpl(em);
			Cliente c = cDAO.pesquisar(2);
			ReservaDAO rDAO = new ReservaDAOImpl(em);
			
			System.out.println("Quantidade de reservas : " + rDAO.ContarReserva(2) + " do Cliente : " + c.getNome());
	
		
			em.close();
			fa.close();
	}

}
