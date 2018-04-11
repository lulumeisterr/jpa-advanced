package br.com.fiap.view;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.impl.ReservaDAOImpl;

public class ContandoPorDatasUtilizandoQueryNaClasse {

	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			ReservaDAO r = new ReservaDAOImpl(em);
			
			
			Calendar Entrada = new GregorianCalendar(2017 , Calendar.JANUARY , 1);
			Calendar Saida = new GregorianCalendar(2018 , Calendar.JANUARY , 1);
			
			System.out.println(r.contarPorDatas(Entrada, Saida));
			
			em.close();
			fa.close();
		
	}
	
}
