package br.com.fiap.dao.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.VeiculoDAOimpl;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.VeiculoDAO;
import br.com.fiap.entity.Veiculo;

public class BuscandoPorValorMinimo {
	public static void main(String[] args) {

		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();

		
		VeiculoDAO vDAO = new VeiculoDAOimpl(em);
		
		List<Veiculo> listaMinAno = vDAO.BuscarValorAnoMinimo(2013);
		
		
		System.out.println("Mostrando");
		
		for (Veiculo veiculo : listaMinAno) {
			
			System.out.println(veiculo.getCor());
			System.out.println(veiculo.getAno() + "\n" + veiculo.getPlaca());
		}

		em.close();
		fa.close();
	}
}
