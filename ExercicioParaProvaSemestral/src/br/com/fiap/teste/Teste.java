package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.daoimpl.ProdutoEstoqueImpl;
import br.com.fiap.entity.Estoque;
import br.com.fiap.entity.Produto;
import br.com.fiap.entity.ProdutoEstoque;
import br.com.fiap.jpa.dao.EntityManagerFactorySingleton;
import br.com.fiap.jpa.dao.ProdutoEstoqueDAO;


public class Teste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
		
			ProdutoEstoqueDAO peDAO = new ProdutoEstoqueImpl(em);
		
			Produto p = new Produto("Caneta", "BIQ");
			Estoque e = new Estoque(1, "rua X", 100);
			ProdutoEstoque pe = new ProdutoEstoque(p, e, 1);
			
			try {
			
			peDAO.gravar(pe);
			peDAO.commit();	
				
			}catch(Exception ex) {
				ex.printStackTrace();
			}
			
			em.close();
			fa.close();
		
	}

}
