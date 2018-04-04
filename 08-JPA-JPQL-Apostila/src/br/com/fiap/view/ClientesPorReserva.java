package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ClientesPorReserva {

	public static void main(String[] args) {
	
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em  = fa.createEntityManager();
		
		
		ClienteDAO cliDAO = new ClienteDAOImpl(em);
		
	
		List<Cliente> listClient = cliDAO.ListarPorClienteReserva(10);
		System.out.println("LISTAR CLIENTE POR DIA RESERVA");
		
		for (Cliente cliente : listClient) {
			System.out.println(cliente.getNome());
		}
	
		em.close();
		fa.close();

	}

}
