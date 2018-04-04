package br.com.fiap.view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;
import br.com.fiap.dao.impl.PacoteDAOImpl;
import br.com.fiap.dao.impl.TransporteDAOImpl;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class RecuperandoTransport {

	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();
		
		int i = 1;
	
		switch (i) {
		case 1:
			BuscandoPorNomeEmpresa(em , fa);
			break;	
		case 2:
			BuscandoPorPacote(em , fa);
			break;
		default:
			break;
		}
	}
	

	private static void BuscandoPorPacote(EntityManager em, EntityManagerFactory fa) {
		
		PacoteDAO pDAO = new PacoteDAOImpl(em);
		
		TransporteDAO tDAO = new TransporteDAOImpl(em);
		
		System.out.println("Buscando transporte");

		//Realizando a consulta para exibir os resultados
		Transporte t = tDAO.pesquisar(1);
		List<Pacote> pacote2 = pDAO.ListarTransporte(t);
		
		System.out.println("Listando pacote");

		for (Pacote pacote : pacote2) {
			System.out.println(pacote.getDescricao());
		}
		
		em.close();
		fa.close();
		
	}

	private static void BuscandoPorNomeEmpresa(EntityManager em , EntityManagerFactory fa) {
	
		PacoteDAO pDAO = new PacoteDAOImpl(em);
		
		List<Pacote> pacote = pDAO.obterListaPacote("GOL");
		
		for (Pacote pacote2 : pacote) {
			System.out.println("Exibindo o nome da transportadora : " + pacote2.getTransporte().getEmpresa());
		}
		
		em.close();
		fa.close();
	}


}
