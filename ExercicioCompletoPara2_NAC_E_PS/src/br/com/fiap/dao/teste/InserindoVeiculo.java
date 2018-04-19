package br.com.fiap.dao.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.VeiculoDAOimpl;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.VeiculoDAO;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.enumm.EnumCor;

public class InserindoVeiculo {

	public static void main(String[] args)throws Exception{
		
		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
			EntityManager em = fa.createEntityManager();
			
			VeiculoDAO vDAO = new VeiculoDAOimpl(em);
			
		//	Calendar Ano = new GregorianCalendar(2015 , Calendar.MAY , 27);
			Veiculo v0 = new Veiculo("B1414", EnumCor.PRETO, 2013);
			Veiculo v1 = new Veiculo("EN213", EnumCor.AZUL, 2015);
			Veiculo v2 = new Veiculo("CL312", EnumCor.ROSA, 2011);
			Veiculo v3 = new Veiculo("DK411", EnumCor.VERMELHO, 2017);
			Veiculo v4 = new Veiculo("FJ510", EnumCor.VERDE, 2012);
			Veiculo v5 = new Veiculo("JI693", EnumCor.AMARELO, 2017);
			Veiculo v6 = new Veiculo("GE783", EnumCor.PRETO, 2018);
			
			System.out.println("inserindo");
			
			vDAO.Cadastrar(v0);
			vDAO.Cadastrar(v1);
			vDAO.Cadastrar(v2);
			vDAO.Cadastrar(v3);
			vDAO.Cadastrar(v4);
			vDAO.Cadastrar(v5);
			vDAO.Cadastrar(v6);
			
			vDAO.Salvar();
			
			em.close();
			fa.close();

	}
	
}
