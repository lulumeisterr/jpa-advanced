package br.com.fiap.ImplementacaoDAO;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import br.com.fiap.genericDAO.GenericDAO;

public class GenericDAOFather<Tabela , Chave> implements GenericDAO<Tabela, Chave>{

	
	/*
	 * D�O QUE SERVE PARA QUALQUER CLASSE
	   Onde voc� passa por parametro <Tabela,Chave) essa chave � a onde voc� deseja fazer a busca
	 */
	
	/*
	 *  Os m�todos de neg�cio espec�ficos da entidade devem ser implementados na
		classe DAO filha e n�o na DAO gen�rica!
	 */
	
	
	//Construtor
	@SuppressWarnings("unchecked")
	public GenericDAOFather(EntityManager em){
		super();
		
		/*
		 *  obtendo qual o tipo de dado gen�rico passado como par�metro para o DAO 
		 */
		
		clazz = (Class<Tabela>) ((ParameterizedType) 
                //Devolve os parametros da classe
				getClass().getGenericSuperclass()).getActualTypeArguments()[0];

	}


	//Pegar a tabela em tempo de excecu��o
	private Class<Tabela> clazz;
	
	
	@Override
	public void Inserir(Tabela tabela) {
		
		
	}

	@Override
	public Tabela Buscar(Tabela tabela) {
		
		return null;
	}

	@Override
	public void Excluir(Chave codigo) {
	
		
	}

	@Override
	public void Atualizar(Tabela tabela) {
		
		
	}

	@Override
	public void commit() {
	
		
	}

	
}
