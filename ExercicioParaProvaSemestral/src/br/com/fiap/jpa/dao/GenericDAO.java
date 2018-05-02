package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.DBException;
import br.com.fiap.jpa.exception.IdNotFoundException;


public interface GenericDAO<Tabela,Chave> {

	void gravar(Tabela tabela);
	
	void atualizar(Tabela tabela);
	
	void apagar(Chave codigo) throws IdNotFoundException;
	
	Tabela buscar(Chave codigo);
	
	void commit() throws DBException;
}

