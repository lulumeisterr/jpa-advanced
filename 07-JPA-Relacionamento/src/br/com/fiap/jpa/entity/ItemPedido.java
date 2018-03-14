package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_ITEM_PEDIDO")
@SequenceGenerator(sequenceName="SQ_ITEM_PEDIDO" , allocationSize = 1 , name="Itempedido")
public class ItemPedido {

	@GeneratedValue(generator = "Itempedido" ,strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "cd_Item")
	private int codigo;

	@Column(name = "vl_item")
	private double valor;

	@Column(name = "qt_item")
	private int quantidade;

	//Um Pedido para varios items
	// Pedido N __________ ITEM_PEDIDO 1
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cd_pedido") // Para ser obrigatorio e cadastrar o relacionamento
	private Pedido pedido;

	public ItemPedido(){
		
	}

	public ItemPedido(double valor, int quantidade) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}







}