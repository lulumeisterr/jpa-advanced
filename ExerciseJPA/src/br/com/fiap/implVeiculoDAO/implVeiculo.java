package br.com.fiap.implVeiculoDAO;

import javax.persistence.EntityManager;

import br.com.fiap.bean.Veiculo;
import br.com.fiap.dao.VeiculoDAO;

public class implVeiculo implements VeiculoDAO{


	private EntityManager em;

	
	
	public implVeiculo(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void gravar(Veiculo v) {
		em.persist(v);
	}

	@Override
	public void Atualizar(Veiculo v1) {
		em.merge(v1);
	}

	@Override
	public void Apagar(int id) throws Exception {
		Veiculo v = Buscar(id);
		
		if(v == null){
			throw new Exception("Funcionario inexistente");
		}
		
		em.remove(v);
	}

	@Override
	public Veiculo Buscar(int id) {
		return em.find(Veiculo.class, id);
	}

	@Override
	public void commit() throws Exception{
		try{
			em.getTransaction().begin();
			em.getTransaction().commit();
		}catch(Exception e){
			if(em.getTransaction().isActive());
			em.getTransaction().rollback();
			e.printStackTrace();
			
			throw new Exception("Erro ao realizar o commit");
			
		}
	}





}
