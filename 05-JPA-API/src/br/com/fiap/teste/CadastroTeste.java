package br.com.fiap.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.bean.EnumEscolaridade;
import br.com.fiap.bean.Funcionario;

public class CadastroTeste {

		public static void main(String[] args) {
			
			EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
			EntityManager em = fabrica.createEntityManager();
			
			Funcionario f = new Funcionario("Lucas" , 
											new GregorianCalendar(2017,Calendar.FEBRUARY,30) , 
											Calendar.getInstance(), 
											25000 , 
											null ,
											EnumEscolaridade.ENSINO_SUPERIOR);
			
			//Persistir o cadastro do funcionario
			
			em.persist(f);
			
			//Iniciar uma transação
			
			em.getTransaction().begin();
			
			//Finalizar com commit a transação
			
			em.getTransaction().commit();
			
			em.close();
			fabrica.close();
			
			
		}
}
