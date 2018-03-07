package br.com.fiap.teste.veiculo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.bean.Veiculo;
import br.com.fiap.implVeiculoDAO.implVeiculo;



public class VeiculoTeste{

	public static void main(String[] args) throws Exception {
		
		implVeiculo imp = new implVeiculo();
		
		EntityManagerFactory f = Persistence.createEntityManagerFactory("exercicio");
		EntityManager em = f.createEntityManager();
		
		Veiculo v = new Veiculo("XXTN3L4S" , 
								"Vermelho" , 
								new GregorianCalendar(2004 , Calendar.YEAR , Calendar.NOVEMBER));
		
		em.persist(v);
		em.getTransaction().begin();
		em.getTransaction().commit();
		em.close();
		f.close();
		
	}

	
}
