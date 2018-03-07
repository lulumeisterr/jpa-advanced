package br.com.fiap.singleton;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {

	
	// 1 -  Atributo estatico
	private static EntityManagerFactory fa;
	
	// 2 - Construtor privador
	private EntityManagerFactorySingleton(){}
	
	// 3 - Metodo estático
	public static EntityManagerFactory getInstance(){
		if(fa == null){
			fa = Persistence.createEntityManagerFactory("oracle");
		}
		return fa;
	}
	
	
}
