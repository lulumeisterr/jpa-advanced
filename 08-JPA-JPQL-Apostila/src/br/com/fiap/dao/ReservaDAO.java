package br.com.fiap.dao;

import java.util.Calendar;

import br.com.fiap.entity.Reserva;

public interface ReservaDAO extends GenericDAO<Reserva,Integer>{
	
	//Retornando a quantidade de clientes que possuem o cliente
	
		long ContarReserva(int id);
		long contarPorDatas(Calendar inicio , Calendar fim);
		long RetornarClienteMaiorReserva();

}
