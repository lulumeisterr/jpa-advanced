package br.com.fiap.teste;

import java.util.Calendar;

import br.com.fiap.bean.ContaPoupanca;

public class TestePoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca p = new ContaPoupanca(1, 01, Calendar.getInstance(), 300, 10);
		p.CalcularRetornoInvestimento(300);
		
		
		System.out.println(p.getSaldo());
		p.depositar(1, 100);
		System.out.println(p.getTaxa());
	}
}

