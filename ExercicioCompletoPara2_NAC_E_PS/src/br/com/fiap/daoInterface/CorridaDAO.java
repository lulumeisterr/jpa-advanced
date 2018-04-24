package br.com.fiap.daoInterface;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Corrida;
import br.com.fiap.generics.GenericDAO;

public interface CorridaDAO extends GenericDAO<Corrida, Integer>{

	List<Corrida> listagemData (Calendar inicio , Calendar fim);
	
	//4
	
}
