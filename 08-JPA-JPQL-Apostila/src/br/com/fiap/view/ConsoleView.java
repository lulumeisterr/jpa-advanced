package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.CidadeDAO;
import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.impl.CidadeDAOImpl;
import br.com.fiap.entity.Cidade;

public class ConsoleView {

	public static void main(String[] args) {
		
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em  = fa.createEntityManager();
		
		
		/*
		 *  Listando todas as cidades
		 */
		
		CidadeDAO cidadeDAO = new CidadeDAOImpl(em);
		
		
		//Relizando o select
		List<Cidade> cityDAO = cidadeDAO.cityList();
	
		System.out.println("LISTA DE CIDADES");
		
		//Imprimindo
		for (Cidade cidade : cityDAO) {
			System.out.println(cidade.getNome() + " " + cidade.getUf());
		}
		
		System.out.println("");
		System.out.println("=============EXIBINDO COM PARAMETRO O NUMERO DE HABITATNES ==============");
		System.out.println("");
		
		//Realizando o select
		cityDAO = cidadeDAO.BuscarPorMaiorNumeroHabitante(100);
		System.out.println("BUSCANDO POR NUMERO DE HABITANTES");
		
		//Exibindo
		
		for (Cidade cidade : cityDAO) {
			System.out.println("NUMERO DE HABITANTES : " + " " + cidade.getNrHabitantes() + 
								"Nome : " + " " +  cidade.getNome());
		}
		
		
		System.out.println("");
		System.out.println("=======Obter todos os Clientes===========");
		System.out.println("");
		
		em.close();
		fa.close();
		
	}

}



