package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EnderecoDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.dao.impl.EnderecoDAOImpl;
import br.com.fiap.entity.Cliente;


public class BuscandoClienteTwoParameters {

	public static void main(String[] args) {

		/*
		 * buscar(String nome, String cidade): retorna os clientes que
possuam no nome o texto informado como parâmetro e que tenham
algum endereço no nome de cidade informado;
		 * 
		 * 
		 */


		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();

		ClienteDAO cli = new ClienteDAOImpl(em);
		
		List<Cliente> clientes = cli.BuscarPorNomeCidade("a","a");
		
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getEndereco().getCidade().getNome());

		}


		em.close();
		fa.close();
	}

}
