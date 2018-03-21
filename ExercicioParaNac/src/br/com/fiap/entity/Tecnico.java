package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "T_TECNICO")
@Entity
@SequenceGenerator(sequenceName="SQ_T_TECNICO" , allocationSize = 1 , name = "coach")

public class Tecnico implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -5518107888268445249L;

	@Id
	@GeneratedValue(generator = "coach" , strategy = GenerationType.SEQUENCE)
	
	@OneToOne(mappedBy = "tecnico")
	@Column(name = "cd_tecnico")
	private int cd;
	
	@Column(name = "nm_tecnico" ,  nullable = false ,length = 50)
	private String nome;
	
	@Column(name = "vl_salario")
	private double salario;
	

	public Tecnico(){
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
