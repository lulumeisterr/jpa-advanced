package br.com.fiap.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.tool.schema.extract.spi.ExtractionContext.DatabaseObjectAccess;

import br.com.fiap.jpa.dao.PessoaDAO;
import br.com.fiap.jpa.dao.impl.PessoaDAOimpl;
import br.com.fiap.jpa.entity.Pessoa;
import br.com.fiap.jpa.entity.PessoaFisica;
import br.com.fiap.jpa.entity.PessoaJuridica;
import br.com.fiap.jpa.singleton.EntityManagerFactorySingleton;

public class TestandoHeranca {

	public static void main(String[] args) {
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager(); 
		
		PessoaDAO pDAO = new PessoaDAOimpl(em);
		
		Pessoa pessoa = new Pessoa("Lucas", "OZ");
		PessoaFisica pf = new PessoaFisica("Marcos", "Rua X", 493994544, "52776569100");
		PessoaJuridica pj = new PessoaJuridica("Educacao LTDA", "Lins", "323.265.651", "FIAP");
		
		pDAO.gravar(pessoa);
		pDAO.gravar(pf);
		pDAO.gravar(pj);
		
		try {
			pDAO.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}

		em.close();
		fa.close();
	}
	
}
