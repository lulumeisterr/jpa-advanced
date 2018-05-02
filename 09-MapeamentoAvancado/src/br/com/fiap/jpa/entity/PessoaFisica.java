package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

//Para SingleTABLE
//@DiscriminatorValue("PF")
@Entity
@Table(name = "T_PESSOA_AULA_FISICA")
public class PessoaFisica extends Pessoa{

	private static final long serialVersionUID = 7694466439854447998L;

	@Column(name = "nr_cpf" , nullable = false)
	private float cpf;
	
	@Column(name = "nr_rg" , nullable = false)
	private String rg;
	
	public PessoaFisica() {
		
	}
		
	
	public PessoaFisica(String nome, String endereco, float cpf, String rg) {
		super(nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
	}

	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
}
