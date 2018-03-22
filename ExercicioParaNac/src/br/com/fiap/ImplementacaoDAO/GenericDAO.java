package br.com.fiap.ImplementacaoDAO;

public interface GenericDAO<Tabela, Chave>{
	
	/*
	 * Criar um DAO que possa ser reutilizado (via herança) para as operações básicas
	   de persistência (CRUD);
	 * 
	 */
	
	
	//Cadastrar
	void Inserir(Tabela tabela);
	
	//Buscar
	Tabela Buscar(Chave codigo);
	
	//Excluir
	void Excluir(Chave codigo);
	
	//Atualizar
	void Atualizar(Tabela tabela);
	
	//Commitar
	void commit()throws Exception;
	
	
	
}
