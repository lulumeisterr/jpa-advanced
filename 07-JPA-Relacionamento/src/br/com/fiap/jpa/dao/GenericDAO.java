package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.excecao.CommitException;
import br.com.fiap.jpa.excecao.RegistroNaoEncontrado;

public interface GenericDAO<Tabela,Chave> {
	
	void gravar(Tabela tabela);
	
	void excluir(Chave codigo)throws RegistroNaoEncontrado;
	
	void atualizar(Tabela tabela);
	
	Tabela buscar(Chave codigo);
	
	void commit() throws CommitException;
	
}