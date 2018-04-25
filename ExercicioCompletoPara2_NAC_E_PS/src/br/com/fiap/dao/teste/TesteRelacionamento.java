package br.com.fiap.dao.teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.fiap.dao.impl.CorridaDAOimpl;
import br.com.fiap.dao.impl.MotoristaDAOimpl;
import br.com.fiap.dao.impl.VeiculoDAOimpl;
import br.com.fiap.daoInterface.CorridaDAO;
import br.com.fiap.daoInterface.EntityManagerFactorySingleton;
import br.com.fiap.daoInterface.MotoristaDAO;
import br.com.fiap.daoInterface.VeiculoDAO;
import br.com.fiap.entity.Corrida;
import br.com.fiap.entity.Motorista;
import br.com.fiap.entity.Pagamento;
import br.com.fiap.entity.Passageiro;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.enumm.EnumCor;
import br.com.fiap.enumm.EnumFormaPagamento;
import br.com.fiap.enumm.GeneroEnum;

public class TesteRelacionamento {

	public static void main(String[] args) {

		EntityManagerFactory fa = EntityManagerFactorySingleton.getInstance();
		EntityManager em = fa.createEntityManager();

		//Preenchendo obj
		
		Calendar data = new GregorianCalendar(1998 , Calendar.FEBRUARY , 27);
		Motorista driver = new Motorista(1, "Lucas", data, null, GeneroEnum.MASCULINO);

		Veiculo v0 = new Veiculo("B1414", EnumCor.PRETO, 2013);

		Passageiro person = new Passageiro("Jaber", data, GeneroEnum.FEMININO);

		Calendar dataCorrida = new GregorianCalendar(2018 , Calendar.FEBRUARY , 27);
		Corrida run = new Corrida("Carapicuiba", "Vila Olimpia", dataCorrida, 55);

		Calendar dataPagamento = new GregorianCalendar(2018 , Calendar.FEBRUARY , 27);
		Pagamento pay = new Pagamento(dataPagamento, 55, EnumFormaPagamento.DINHEIRO);
		
		//============================================================
		
		//Preenchendo FKS
		
		run.setMotorista(driver);
		run.setPassageiro(person);
		run.setPagamento(pay); // Relacionamento do mappedBy
		pay.setCorrida(run);
		
		
		// Um Veiculo tem uma lista de motorista
		
		List<Veiculo> listVeiculo = new ArrayList<>();
		listVeiculo.add(v0);
		driver.setListaVeiculo(listVeiculo);
		
		CorridaDAO dao = new CorridaDAOimpl(em);
		try{
			
			dao.Cadastrar(run);
			dao.Salvar();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		em.close();
		fa.close();

	}

}
