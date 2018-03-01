package br.com.fiap.bean;

import java.util.Calendar;

public abstract class  Conta {

	private int agencia;
	private int numero;
	private Calendar dataAbertura;
	protected double saldo;
	
	public Conta(){
		
		
	}
	
	public Conta(int agencia, int numero, Calendar dataAbertura, double saldo) {
		super();
		setAgencia(agencia);
		setNumero(numero);
		setDataAbertura(dataAbertura);
		setSaldo(saldo);
	}
	
	//Depositar
	public abstract double depositar (int agencia , double valor) throws Exception;
	
	//Retirar
	public abstract double retirar(int agencia , double valor)throws Exception;
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
