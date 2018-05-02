package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

//Para SingleTABLE
//@DiscriminatorValue("PJ")
@Entity
@Table(name = "T_PESSOA_AULA_JURIDICA")
public class PessoaJuridica extends Pessoa{

	private static final long serialVersionUID = -2022880151185676493L;

	@Column(name = "nr_cnpj" , nullable = false , length = 11)
	private String cnpj;
	
	@Column(name = "nm_fantasia" , nullable = false , length = 100)
	private String nomeFantasoa;

	
	public PessoaJuridica() {
		
	}


	public PessoaJuridica(String nome, String endereco, String cnpj, String nomeFantasoa) {
		super(nome, endereco);
		this.cnpj = cnpj;
		this.nomeFantasoa = nomeFantasoa;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNomeFantasoa() {
		return nomeFantasoa;
	}


	public void setNomeFantasoa(String nomeFantasoa) {
		this.nomeFantasoa = nomeFantasoa;
	}


	
	
	


}
