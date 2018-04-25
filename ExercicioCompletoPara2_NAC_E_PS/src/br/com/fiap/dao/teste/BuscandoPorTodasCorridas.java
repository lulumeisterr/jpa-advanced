package br.com.fiap.dao.teste;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.CorridaDAOimpl;
import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.entity.Corrida;
import br.com.fiap.entity.Motorista;

public class BuscandoPorTodasCorridas {

	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			MotoristaDAO m = new MotoristaDAOimpl(em);
			CorridaDAO cDAO = new CorridaDAOimpl(em);
			
			Motorista m1 = m.Pesquisar(1);
			
			List<Corrida> listaBuscagem = cDAO.buscarPorCorrida(m1);
			
			for (Corrida corrida : listaBuscagem) {
				System.out.println(corrida.getMotorista().getNome());
			}
		
			em.close();
			fa.close();
	}
	
}
