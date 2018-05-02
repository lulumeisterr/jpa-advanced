package br.com.fiap.daoimpl;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;


import br.com.fiap.jpa.dao.GenericDAO;

import br.com.fiap.jpa.exception.DBException;
import br.com.fiap.jpa.exception.IdNotFoundException;


public class GenericDAOImpl<Tabela,Chave> 
implements GenericDAO<Tabela, Chave>{

	private EntityManager em;

	private Class<Tabela> classe;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl(EntityManager em) {
		this.em = em;
		classe = (Class<Tabela>) ((ParameterizedType)
				getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void gravar(Tabela tabela) {
		em.persist(tabela);
	}

	@Override
	public void atualizar(Tabela tabela) {
		em.merge(tabela);
	}

	@Override
	public void apagar(Chave codigo) throws IdNotFoundException {
		Tabela tabela = buscar(codigo);
		if (tabela == null){
			throw new  IdNotFoundException("Registro não encontrado");
		}
		em.remove(tabela);
	}

	@Override
	public Tabela buscar(Chave codigo) {
		return em.find(classe, codigo);
	}

	@Override
	public void commit() throws  DBException{
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if (em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			e.printStackTrace();
			throw new DBException("Erro ao gravar");
		}

	}


}




