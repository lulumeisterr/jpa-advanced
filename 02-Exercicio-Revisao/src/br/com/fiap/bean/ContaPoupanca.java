package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

	private float taxa;

	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	public static float getRendimento() {
		return rendimento;
	}

	//Constante
	private static final float rendimento = (float) 0.005;
	
	@Override
	public void CalcularRetornoInvestimento(double saldo) {
		double c = 0;
		c = saldo * rendimento;
		System.out.println(c);
	}

	@Override
	//Depositar valor ao saldo
	public double depositar(int agencia, double valor) {
		double x = 0;
		x = getSaldo();
		x += valor;
		System.out.println("Saldo  : " + getSaldo());
		System.out.println("Saldo Atual " + x);
		return x; 
	}

	@Override
	public double retirar(int agencia, double valor)throws Exception{
		double x = 0;
		
		float vlTaxa = taxa;
		vlTaxa = 10;
		
		if(this.getSaldo() >= valor + taxa){
			 x = saldo -= valor + vlTaxa;
		}else{
			throw new Exception("Saldo insuficiente");
		}
		return x;
	}
	
	

}
