package br.com.fiap.dao.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.CorridaDAOimpl;
import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.entity.Corrida;

public class RealizandoBuscaPorData {

	public static void main(String[] args) {

		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();

			CorridaDAO cDAO = new CorridaDAOimpl(em);
			
				Calendar inicio = new GregorianCalendar(2018 , Calendar.FEBRUARY , 27);
				Calendar fim = new GregorianCalendar(2018 , Calendar.DECEMBER , 1);
			
				List<Corrida> listagemData = cDAO.listagemData(inicio, fim);
				
				
				System.out.println("Listagem por data");
				
				for (Corrida corrida : listagemData) {
					
					System.out.println("Data de inicio : " + inicio);
					System.out.println(corrida.getDataCorrida());
				}

				
				em.close();
				fa.close();
	}

}
