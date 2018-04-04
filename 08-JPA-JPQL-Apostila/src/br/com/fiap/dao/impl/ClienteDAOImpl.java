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
				 .setParameter("n", dias)
				 .getResultList();
	}

	@Override
	public List<Cliente> ListarPorNomeComLike(String nome) {
		return em.createQuery("from Cliente c where c.nome like :n" , Cliente.class)
				 .setParameter("n", "%" + nome + "%")
				 .getResultList();
	}



}







