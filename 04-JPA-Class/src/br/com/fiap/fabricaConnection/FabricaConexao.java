package br.com.fiap.fabricaConnection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {

	//Gerenciador de entidades
	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("exercicio");
	
	public  EntityManager getEntityManager(){
		return fabrica.createEntityManager();
	}
	
	//Quando a entidade � gerenciada , � porque o entity reconhece esse objeto
	//Quando o entity manger nao reconhece , nada acontece com a classe
	//getTransaction ele me fornece uma transa��o
	
	
}
