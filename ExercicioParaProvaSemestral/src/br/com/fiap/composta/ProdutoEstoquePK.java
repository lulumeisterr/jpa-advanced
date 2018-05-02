package br.com.fiap.composta;

import java.io.Serializable;

public class ProdutoEstoquePK implements Serializable {

	private static final long serialVersionUID = -7914018377298854177L;
	
	private int estoque;
	private int prod;
	
	
	public ProdutoEstoquePK() {
		
	}


	public int getEstoque() {
		return estoque;
	}


	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}


	public int getProd() {
		return prod;
	}


	public void setProd(int prod) {
		this.prod = prod;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + estoque;
		result = prime * result + prod;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoEstoquePK other = (ProdutoEstoquePK) obj;
		if (estoque != other.estoque)
			return false;
		if (prod != other.prod)
			return false;
		return true;
	}

	
	
	

}

	