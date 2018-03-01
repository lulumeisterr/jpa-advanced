package br.com.fiap.dao;

import br.com.fiap.bean.Pessoa;

public interface PessoaDAO {
	
	public void gravar(Pessoa p);
	public void apagar(int id);
	

}
