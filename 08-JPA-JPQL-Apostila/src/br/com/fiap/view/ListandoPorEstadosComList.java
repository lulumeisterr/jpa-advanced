package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;

public class ListandoPorEstadosComList {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			
			List<String> listarEstados = new ArrayList<>();
			
			listarEstados.add("SP");
			listarEstados.add("PR");
			
			ClienteDAO cDAO = new ClienteDAOImpl(em);
			List<Cliente> listarClienteEstado = cDAO.listarPorEstados(listarEstados);
			
			for (Cliente cliente : listarClienteEstado) {
				System.out.println(cliente.getNome());
				System.out.println(cliente.getEndereco().getCidade().getUf());
			}
			
		em.close();
		fa.close();
		
	}

}
