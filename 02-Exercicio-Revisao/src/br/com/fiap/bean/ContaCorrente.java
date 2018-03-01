package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;

	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public ContaCorrente(){

	}

	public ContaCorrente(TipoConta tipo) {
		super();
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

	@Override
	public double depositar(int agencia, double valor) throws Exception {
		saldo -= valor;
		throw new Exception("Saldo insuficiente");

	}



	@Override
	public double retirar(int agencia, double valor) throws Exception {

		TipoConta typ = TipoConta.COMUM;
		double result = 0;

		if(typ.equals(TipoConta.COMUM) && valor > this.getSaldo()){
			throw new Exception("Você não tem saldo suficiente para retirar");
		}else{

			result = this.getSaldo() - valor;

			System.out.println("Sacado : " + valor);
			System.out.println("Saldo atual : " + result);
		}

		return result;
	}



}
