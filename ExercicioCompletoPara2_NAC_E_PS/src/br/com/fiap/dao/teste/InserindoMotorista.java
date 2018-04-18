package br.com.fiap.dao.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.entity.Motorista;
import br.com.fiap.enumm.GeneroEnum;

public class InserindoMotorista {

	public static void main(String[] args) throws Exception{
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			MotoristaDAO drvDAO = new MotoristaDAOimpl(em);
			
			Calendar data = new GregorianCalendar(1998 , Calendar.FEBRUARY , 27);
			Calendar data1 = new GregorianCalendar(1998 , Calendar.MARCH , 7);
			Calendar data2 = new GregorianCalendar(1998 , Calendar.AUGUST , 2);
			Calendar data3 = new GregorianCalendar(1998 , Calendar.APRIL , 5);
			Calendar data4 = new GregorianCalendar(1998 , Calendar.JANUARY , 12);
			
			Motorista driver = new Motorista(1, "Lucas", data, null, GeneroEnum.MASCULINO);
			Motorista driver1 = new Motorista(2, "Amanda", data1, null, GeneroEnum.FEMININO);
			Motorista driver2 = new Motorista(3, "Carol", data2, null, GeneroEnum.FEMININO);
			Motorista driver3 = new Motorista(4, "Marina", data3, null, GeneroEnum.FEMININO);
			Motorista driver4 = new Motorista(5, "Nicole", data4, null, GeneroEnum.FEMININO);
			
			drvDAO.Cadastrar(driver);
			drvDAO.Cadastrar(driver1);
			drvDAO.Cadastrar(driver2);
			drvDAO.Cadastrar(driver3);
			drvDAO.Cadastrar(driver4);
		
			drvDAO.Salvar();
			
			em.close();
			fa.close();
			
	}
	
}
