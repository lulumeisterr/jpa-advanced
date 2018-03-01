package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista implements Serializable{

	private static final long serialVersionUID = -4877702802936402504L;
	
	@Id
	@Column(name = "nr_carteira")
	private int nr_carteira;
	@Column(name = "ds_nome" , length = 150)
	private String nome;
	@Column(name = "dt_nascimento")
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;
	@Column(name = "ds_foto")
	@Lob
	private byte[] foto;
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	public Motorista(){
		
	}
	
	public Motorista(int nr_carteira, String nome, Calendar dt_nascimento, byte[] foto, Genero genero) {
		super();
		this.nr_carteira = nr_carteira;
		this.nome = nome;
		this.dt_nascimento = dt_nascimento;
		this.foto = foto;
		this.genero = genero;
	}

	public int getNr_carteira() {
		return nr_carteira;
	}

	public void setNr_carteira(int nr_carteira) {
		this.nr_carteira = nr_carteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	
	
	
}
