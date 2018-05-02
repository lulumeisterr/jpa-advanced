package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.jpa.dao.ConsultaDAO;
import br.com.fiap.jpa.dao.impl.ConsultaDAOimpl;
import br.com.fiap.jpa.entity.Consulta;
import br.com.fiap.jpa.entity.Medico;
import br.com.fiap.jpa.entity.Paciente;
import br.com.fiap.jpa.enums.EnumEspecialidade;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class CadastrandoAll {
	
	public static void main(String[] args) {

		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager(); 
		
		ConsultaDAO cDAO = new ConsultaDAOimpl(em);
		
		Calendar dt = new GregorianCalendar(2018 , Calendar.FEBRUARY , 27);
		
		Medico m = new Medico(1, "Lucas", EnumEspecialidade.CARDIOLOGISTA , 10 , 500);
		Paciente p = new Paciente("Wes" , dt);
		Consulta c = new Consulta(dt , "Consultorio 02" , true);
		

		c.setMedico(m);
		c.setPaciente(p);
		
		try {
			
			cDAO.gravar(c);
			cDAO.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		em.close();
		fa.close();
	}

}
