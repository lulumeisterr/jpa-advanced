package br.com.fiap.daoimpl;

import javax.persistence.EntityManager;

import br.com.fiap.composta.ProdutoEstoquePK;
import br.com.fiap.entity.ProdutoEstoque;
import br.com.fiap.jpa.dao.ProdutoEstoqueDAO;

public class ProdutoEstoqueImpl extends GenericDAOImpl<ProdutoEstoque, ProdutoEstoquePK> implements ProdutoEstoqueDAO {

	public ProdutoEstoqueImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}


}
