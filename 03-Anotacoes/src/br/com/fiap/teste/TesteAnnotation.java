package br.com.fiap.teste;

import br.com.fiap.annotation.Tabela;
import br.com.fiap.bean.Cidade;

public class TesteAnnotation {
	public static void main(String[] args) {
	
		Cidade cidade = new Cidade();
		
		Tabela anotacao = cidade.getClass().getAnnotation(Tabela.class);
		System.out.println(cidade.inserirSQL(cidade) + anotacao.nomeTabela());
				
	}

}
