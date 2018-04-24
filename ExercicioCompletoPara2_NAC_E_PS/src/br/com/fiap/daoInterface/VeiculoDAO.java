package br.com.fiap.daoInterface;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.entity.Veiculo;
import br.com.fiap.generics.GenericDAO;

public interface VeiculoDAO extends GenericDAO<Veiculo, Integer>{

	List<Veiculo> BuscarValorAnoMinimo (int Anomin);
	
}
