package br.com.fiap.jpa.dao;

import br.com.fiap.bean.Funcionario;
import br.com.fiap.exception.CommitException;
import br.com.fiap.exception.EmptyFuncionarioException;

public interface FuncionarioDAO {

	//Assinatura dos metodos
	
	void gravar(Funcionario f);
	
	void apagar(int codigo)throws EmptyFuncionarioException;
	
	void atualizar(Funcionario f);
	
	void commit()throws CommitException;
	
	Funcionario buscar(int codigo);
	
}
