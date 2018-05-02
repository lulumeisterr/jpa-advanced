package br.com.fiap.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


// Realizando henrança e passando a estrategia que sera utilizada SingleTable ou Joined
// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@Inheritance(strategy = InheritanceType.JOINED)

//Configurando o nome da coluna para Single TABLE
@DiscriminatorColumn(name = "ds_tipo")

//Valor a ser gravado no Banco para identificar as tabelas Para singleTABLE
//@DiscriminatorValue("P")

@Entity
@Table(name = "T_AULA_PESSOA")
@SequenceGenerator(name = "pessoa" , allocationSize = 1 , sequenceName = "SQ_T_PESSOA")

public class Pessoa implements Serializable{
	
	
	private static final long serialVersionUID = 7343228967908868310L;
	
	@Id
	@GeneratedValue(generator = "pessoa" , strategy = GenerationType.SEQUENCE)
	private int id;
	@Column(name = "nm_pessoa" , nullable = false , length = 100)
	private String nome;
	@Column(name = "ds_endereco" , nullable = false , length = 100)
	private String endereco;
	
	public Pessoa() {
		
	}
	
	
	
	public Pessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
