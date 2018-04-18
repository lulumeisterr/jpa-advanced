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

	@ManyToMany(mappedBy = "listamotor")
	List<Veiculo> listaVeiculo;
	
	@OneToMany(mappedBy = "motorista" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private List<Corrida> listacorrida;
	
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
	
	
	
	
}
