package br.com.fiap.bean;

public abstract class Pessoa {

	private String nome;
	
	public String gravar(String nome){
		return "Gravando...";
	}
	
	public abstract void apagar(String nome);

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
