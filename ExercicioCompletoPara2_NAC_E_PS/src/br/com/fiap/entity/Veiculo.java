package br.com.fiap.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.enumm.EnumCor;

@Entity
@Table(name = "T_VEICULO")
@SequenceGenerator(name="veiculo" , sequenceName="SQ_T_VEICULO" , allocationSize = 1)
public class Veiculo implements Serializable{

	private static final long serialVersionUID = -4302671136311954928L;

	@Id
	@GeneratedValue(generator = "veiculo" , strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_veiculo")
	private int codigo;
	
	@Column(name = "ds_placa" , length = 9 , nullable=false)
	private String placa;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_cor" , nullable = false)
	private EnumCor cor;
	
	@Column(name = "nr_ano")
	private int Ano;

	//MM
	@ManyToMany
	@JoinTable(name = "T_VEICULO_MOTORISTA" , joinColumns = @JoinColumn(name = "cd_veiculo") , 
						 				inverseJoinColumns = @JoinColumn(name = "cd_motorista"))
	
	List<Motorista> listamotor;
	
	
	List<Corrida> listaCorrida;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, EnumCor cor, int ano) {
		super();
		this.placa = placa;
		this.cor = cor;
		Ano = ano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public EnumCor getCor() {
		return cor;
	}

	public void setCor(EnumCor cor) {
		this.cor = cor;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}
}
