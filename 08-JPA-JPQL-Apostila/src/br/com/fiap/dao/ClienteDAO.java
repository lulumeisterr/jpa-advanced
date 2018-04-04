package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Endereco;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	
	List<Cliente> ExibirTodosOsClientes();
	
	List<Cliente> LocalizarEstado(Endereco end); // Ou String
	
	List<Cliente> ListarPorClienteReserva(int dias);
	
	List<Cliente> ListarPorNomeComLike(String nome);
	
	
	
}