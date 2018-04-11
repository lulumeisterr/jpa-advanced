package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ExibindoCliente {

	public static void main(String[] args) {


		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();
		
		int i = 2;
		switch (i) {
		case 1:
			ListandoPorNome(em , fa);
			break;
		case 2:
			exibirCliente(em, fa);
			break;
		default:
			break;
		}
	}

	private static void ListandoPorNome(EntityManager em, EntityManagerFactory fa) {

		ClienteDAO cliDAO = new ClienteDAOImpl(em);

		// Realizar um select para obter o cliente

		List<Cliente> listClient = cliDAO.ListarPorNomeComLike("thiago");

		System.out.println("LISTA DE CLIENTES");

		for (Cliente cliente : listClient) {
			System.out.println(cliente.getNome());
		}

		em.close();
		fa.close();

	}

	private static void exibirCliente(EntityManager em , EntityManagerFactory fa) {

		ClienteDAO cliDAO = new ClienteDAOImpl(em);

		// Realizar um select para obter o cliente

		List<Cliente> listClient = cliDAO.ExibirTodosOsClientes();

		System.out.println("LISTA DE CLIENTES");

		for (Cliente cliente : listClient) {
			System.out.println(cliente.getNome());
		}

		em.close();
		fa.close();

	}

}
