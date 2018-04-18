package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.enumm.EnumFormaPagamento;

@Entity
@Table(name = "T_PAGAMENTO")
@SequenceGenerator(name = "pagamento" , allocationSize = 1 , sequenceName = "SQ_T_PAGAMENTO")
public class Pagamento implements Serializable{

	private static final long serialVersionUID = -2071838437327517574L;
	
	@Id
	@GeneratedValue(generator = "pagamento" , strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_pagamento")
	private int codigo;
	
	@Column(name = "dt_pagamento" , nullable = false)
	@Temporal(TemporalType.DATE)
	private Calendar ValorPay;
	
	@Column(name = "vl_pagamento" , nullable = false)
	private float ValuePay;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_forma_pagamento" , nullable = false)
	private EnumFormaPagamento formaPay;

	@OneToOne
	@JoinColumn(name="cd_corrida")
	private Corrida corrida;
	
	public Pagamento() {
		
	}
	

	public Pagamento(Calendar valorPay, float valuePay, EnumFormaPagamento formaPay) {
		super();
		ValorPay = valorPay;
		ValuePay = valuePay;
		this.formaPay = formaPay;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Calendar getValorPay() {
		return ValorPay;
	}

	public void setValorPay(Calendar valorPay) {
		ValorPay = valorPay;
	}

	public float getValuePay() {
		return ValuePay;
	}

	public void setValuePay(float valuePay) {
		ValuePay = valuePay;
	}

	public EnumFormaPagamento getFormaPay() {
		return formaPay;
	}

	public void setFormaPay(EnumFormaPagamento formaPay) {
		this.formaPay = formaPay;
	}
	
	
}
