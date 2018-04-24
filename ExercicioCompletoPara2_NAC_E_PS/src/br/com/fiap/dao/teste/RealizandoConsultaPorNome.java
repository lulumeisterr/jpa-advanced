package br.com.fiap.dao.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.entity.Motorista;

public class RealizandoConsultaPorNome {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			MotoristaDAO mDAO = new MotoristaDAOimpl(em);
			
			List<Motorista> listamoto = mDAO.buscarPorNome("Lu");
			
			System.out.println("Exibindo clientes");
			
			for (Motorista motorista : listamoto) {
				System.out.println(motorista.getNome());
			}
			
			em.close();
			fa.close();
		
	}

}
