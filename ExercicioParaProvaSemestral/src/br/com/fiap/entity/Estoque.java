package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_AULA_ESTOQUE")
@SequenceGenerator(name = "estoque" , allocationSize = 1 , sequenceName = "SQ_T_AULA_ESTOQUE")
public class Estoque implements Serializable{
	
	private static final long serialVersionUID = -6962633452080282005L;

	
	@Id
	@GeneratedValue(generator = "estoque" , strategy = GenerationType.SEQUENCE)
	private int estoque;

	
	@Column(name = "ds_endereco" , nullable = false , length = 100)
	private String endereco;
	
	@Column(name = "qt_capacaidade" , nullable = false)
	private int capacidade;
	
	

	public Estoque() {
		
	}
	
	public Estoque(int estoque, String endereco, int capacidade) {
		super();
		this.endereco = endereco;
		this.capacidade = capacidade;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	
	

}
