package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_CORRIDA")
@SequenceGenerator(name = "corrida" , allocationSize = 1 , sequenceName = "SQ_T_CORRIDA")
public class Corrida implements Serializable {

	private static final long serialVersionUID = 1951582535120678720L;

	@GeneratedValue(generator = "corrida" , strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "cd_corrida")
	private int codigo;
	
	@Column(name = "ds_origem" , length = 100)
	private String origem;
	
	@Column(name = "ds_destino" , length = 100)
	private String destino;
	
	@Column(name = "dt_corrida")
	@Temporal(TemporalType.DATE)
	private Calendar dataCorrida;
	
	@Column(name = "vl_corrida" , nullable = false)
	private float valorCorrida;
	
	@ManyToOne(cascade=CascadeType.PERSIST) //Inserindo em cascata
	@JoinColumn(name="nr_carteira")
	private Motorista motorista;
	
	@ManyToOne(cascade=CascadeType.PERSIST) // Inserindo em cascata
	@JoinColumn(name="cd_passageiro")
	private Passageiro passageiro;
	
	//Uma Corrida tem um pagamento
	@OneToOne(mappedBy="corrida",cascade=CascadeType.PERSIST)
	private Pagamento pagamento;
	
	public Corrida() {
		
	}

	
	
	public Pagamento getPagamento() {
		return pagamento;
	}



	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}



	public Corrida(String origem, String destino, Calendar dataCorrida, float valorCorrida) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.dataCorrida = dataCorrida;
		this.valorCorrida = valorCorrida;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataCorrida() {
		return dataCorrida;
	}

	public void setDataCorrida(Calendar dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public float getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(float valorCorrida) {
		this.valorCorrida = valorCorrida;
	}

	public Motorista getMotorista() {
		return motorista;
	}

	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	

	
}
