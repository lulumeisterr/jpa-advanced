package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Endereco;

public class ClientePorEstado {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em  = fa.createEntityManager();
		
		ClienteDAO cliDAO = new ClienteDAOImpl(em);
	
	
		Cliente  c = cliDAO.pesquisar(1);
		List<Cliente> listClient = cliDAO.ExibirTodosOsClientes();
		System.out.println("Buscando Clientes");
		
		
		for (Cliente cliente : listClient) {
			
			System.out.println(cliente.getNome());
			System.out.println("");
			System.out.println(cliente.getEndereco().getCidade().getUf());
		}
		
		em.close();
		fa.close();
	}

}
