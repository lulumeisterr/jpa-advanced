package br.com.fiap.dao;

import br.com.fiap.bean.Veiculo;

public interface VeiculoDAO {
	
	void gravar(Veiculo v);
	void Atualizar(Veiculo v1);
	void Apagar(int id)throws Exception;
	Veiculo Buscar(int id);
	void commit() throws Exception;
	

}
