package br.com.fiap.daoInterface;

import java.util.List;

import br.com.fiap.entity.Motorista;
import br.com.fiap.generics.GenericDAO;

public interface MotoristaDAO extends GenericDAO<Motorista, Integer>{
	
	List<Motorista> buscarPorNome(String nome);

}
