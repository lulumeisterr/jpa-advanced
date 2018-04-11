package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Endereco;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> ExibirTodosOsClientes() {
		
		// Criar Query
		TypedQuery<Cliente> query = em.createQuery("from Cliente" , Cliente.class);
		// Executar
		return query.getResultList();
	}

	@Override
	public List<Cliente> LocalizarEstado(Endereco end) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf = :n" , Cliente.class)
				.setParameter("n", end).getResultList();
	}

	@Override
	public List<Cliente> ListarPorClienteReserva(int dias) {
		return em.createQuery("select r.cliente from Reserva r where r.numeroDias = :n" , Cliente.class)
				 .setMaxResults(10) // Retorna a quantidade desejada de linhas na tabela
				 .setParameter("n", dias)
				 .getResultList();
	}

	@Override
	public List<Cliente> ListarPorNomeComLike(String nome) {
		return em.createQuery("from Cliente c where upper(c.nome) like upper(:n)" , Cliente.class)
				 .setParameter("n", "%" + nome + "%")
				 .getResultList();
	}

	@Override
	public List<Cliente> BuscarPorNomeCidade(String nome, String end) {
		return em.createQuery("from Cliente c where c.nome like :n and c.endereco.cidade.nome like :end" , Cliente.class)
				.setParameter("n", "%" + nome + "%")
				.setParameter("end", "%" + end + "%")
				.getResultList();
	}

	@Override
	public List<Cliente> listarPorEstados(List<String> estados) {
		return em.createQuery("from Cliente c where c.endereco.cidade.uf in :e",Cliente.class)
				.setParameter("e", estados)
				.getResultList();
	}

	@Override
	public long contar() {									   //Tipo de retorno
		return em.createQuery("select count(*) from Cliente c",Long.class).getSingleResult();
	}

	@Override
	public List<Cliente> buscarClientesReserva() {
		return em.createQuery("select r.cliente from Reserva r where r.dataReserva > current_date" , Cliente.class)
				.getResultList();
	}



}







