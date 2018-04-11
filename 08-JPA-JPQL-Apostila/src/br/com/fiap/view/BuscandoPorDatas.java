package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.entity.Pacote;

public class BuscandoPorDatas {

	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
		
			Pacote p = new Pacote();
			PacoteDAO pacDAO = new PacoteDAOImpl(em);
			
			Calendar Entrada = new GregorianCalendar(2015 , Calendar.MAY , 27);
			Calendar Saida = new GregorianCalendar(2017 , Calendar.OCTOBER , 23);
			
			List<Pacote> listDATA = pacDAO.ListarPorData(Entrada , Saida);
			
			for (Pacote pacote : listDATA) {
				
				System.out.println("Data de entrada : " + Entrada);
				System.out.println(pacote.getDescricao());
			}
			
			em.close();
			fa.close();
			
	}
	
}
