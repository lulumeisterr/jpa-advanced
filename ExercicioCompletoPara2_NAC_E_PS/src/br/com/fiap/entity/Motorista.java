package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.enumm.GeneroEnum;

@Entity
@Table(name = "T_MOTORISTA")

public class Motorista implements Serializable {

	private static final long serialVersionUID = 8382384532098991340L;

	@Id
	@Column(name = "nr_carteira")
	private int idCarteira;
	
	@Column(name = "nm_motorista" , length = 150 , nullable = false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNascimento;
	
	@Lob
	@Column(name = "fl_carteira")
	private byte[] foto;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_genero")
	private GeneroEnum genero;
	
	// Um motorista tem uma lista de corrida
	@OneToMany(mappedBy = "motorista")
	private List<Corrida> listacorrida;
	
	//MM
	@ManyToMany(cascade= {CascadeType.PERSIST})
	@JoinTable(name = "T_VEICULO_MOTORISTA" , joinColumns = @JoinColumn(name = "cd_motorista") , 
						 				inverseJoinColumns = @JoinColumn(name = "cd_veiculo"))
	private List<Veiculo> listaVeiculo;

	
	public Motorista() {
		
	}
	
	public Motorista(int idCarteira, String nome, Calendar dataNascimento, byte[] foto, GeneroEnum genero) {
		super();
		this.idCarteira = idCarteira;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
	}


	public int getIdCarteira() {
		return idCarteira;
	}

	public void setIdCarteira(int idCarteira) {
		this.idCarteira = idCarteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

	public List<Veiculo> getListaVeiculo() {
		return listaVeiculo;
	}

	public void setListaVeiculo(List<Veiculo> listaVeiculo) {
		this.listaVeiculo = listaVeiculo;
	}

	public List<Corrida> getListacorrida() {
		return listacorrida;
	}

	public void setListacorrida(List<Corrida> listacorrida) {
		this.listacorrida = listacorrida;
	}
	
	
	
	
	
}
