package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.fiap.composta.ProdutoEstoquePK;

@Entity
@Table(name = "T_PRODUTO_ESTOQUE")
@IdClass(ProdutoEstoquePK.class) 

public class ProdutoEstoque implements Serializable{

	private static final long serialVersionUID = 8753313605951760621L;

	@Id
	@ManyToOne()
	@JoinColumn(name = "cd_produto")
	private Produto prod;
	
	@Id
	@ManyToOne()
	@JoinColumn(name = "cd_estoque")
	private Estoque estoque;
	
	
	@Column(name = "qtd_produto")
	private int produto;
	

	public ProdutoEstoque() {
		
	}
	
	
	public ProdutoEstoque(Produto prod, Estoque estoque, int produto) {
		super();
		this.prod = prod;
		this.estoque = estoque;
		this.produto = produto;
	}
	
	public Produto getProd() {
		return prod;
	}

	public void setProd(Produto prod) {
		this.prod = prod;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}


	
	
	
}
