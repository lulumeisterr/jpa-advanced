package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class BuscandoClienteReservaFuturo {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			ClienteDAO c = new ClienteDAOImpl(em);
			
			List<Cliente> listaRetorna = c.buscarClientesReserva();
			
			System.out.println("CLIENTE COM RESERVAS ATIVAS");
			
			for (Cliente cliente : listaRetorna) {
				System.out.println(cliente.getNome());
			}
			
			em.close();
			fa.close();
			
	}

}
