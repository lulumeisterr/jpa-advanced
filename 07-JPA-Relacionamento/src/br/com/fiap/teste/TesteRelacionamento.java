package br.com.fiap.teste;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.NotaFiscalDAO_impl;
import br.com.fiap.dao.impl.PedidoDAO_impl;
import br.com.fiap.jpa.DAOtwo.NotaFiscal_DAO;
import br.com.fiap.jpa.DAOtwo.Pedido_DAO;
import br.com.fiap.jpa.entity.NotaFiscal;
import br.com.fiap.jpa.entity.Pedido;
import br.com.fiap.jpa.excecao.CommitException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class TesteRelacionamento {

	public static void main(String[] args) {
		
		// Cadastrar
		
		EntityManagerFactory fabrica = EntityManagerFactorySingleton.getInstance();
		EntityManager em  = fabrica.createEntityManager();
		
		//Chamando os DAO's
		Pedido_DAO pDAO = new PedidoDAO_impl(em);
		NotaFiscal_DAO nfDAO = new NotaFiscalDAO_impl(em);
		
		//Preenchendo o obj
		NotaFiscal nf = new NotaFiscal(255, "100");
		Pedido p = new Pedido("Camiseta", GregorianCalendar.getInstance() , nf);
		
		try{
		//nfDAO.gravar(nf);
		pDAO.gravar(p);
		pDAO.commit();
		
		}catch(CommitException e){
			System.err.println(e);
		}
		
		em.close();
		fabrica.close();
		
	}
	
}