package br.com.fiap.jpa.dao;

import br.com.fiap.bean.Departamento;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.DepartamentoNaoEncontradoException;

public interface DepartamentoDAO {
	
	void Cadastrar(Departamento departamento);
	
	Departamento buscar(int codigo);
	
	void Atualizar(Departamento departamento);
	
	void Excluir(int codigo)throws DepartamentoNaoEncontradoException;
	
	void commit() throws CommitException;

}
