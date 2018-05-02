package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.composta.ProdutoEstoquePK;

@Entity
@Table(name = "T_AULA_PRODUTO")
@SequenceGenerator(name = "produto" , allocationSize = 1 , sequenceName = "SQ_T_AULA_PRODUTO")

public class Produto implements Serializable{
	
	private static final long serialVersionUID = 5791817622100634870L;

	@Id
	@Column(name = "cd_produto")
	@GeneratedValue(generator = "produto" , strategy = GenerationType.SEQUENCE)
	private int codigo;
	

	@Column(name = "nm_produto" , nullable = false , length = 100)
	private String nome;
	
	@Column(name = "ds_produto" , nullable = false , length = 100)
	private String descricao;
	
	public Produto() {
		
	}
	
	
	public Produto(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
