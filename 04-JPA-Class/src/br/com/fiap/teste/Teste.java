package br.com.fiap.teste;

import javax.persistence.EntityManager;

import br.com.fiap.fabricaConnection.FabricaConexao;

public class Teste {

	public static void main(String[] args) {
		
		EntityManager em = new FabricaConexao().getEntityManager();
		
		//CREATE apaga e cria
		//Update não apaga mas ele cria para você , caso você adicione um atributo ele realizara para você
		
		em.close();
		
		
	}
	
}
