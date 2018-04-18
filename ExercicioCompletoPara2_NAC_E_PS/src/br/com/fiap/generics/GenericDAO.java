package br.com.fiap.generics;

import br.com.fiap.exception.DBException;
import br.com.fiap.exception.IdNotFoundException;

public interface GenericDAO <Table,Value>{

	void Cadastrar(Table entity);
	Table Pesquisar(Value id);
	void Alterar(Table entity);
	void remover(Value id)throws IdNotFoundException;
	void Salvar()throws DBException;
	
}
