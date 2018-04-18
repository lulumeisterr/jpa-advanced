package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.enumm.GeneroEnum;

@Entity
@Table(name = "T_PASSAGEIRO")
@SequenceGenerator(name = "passageiro" , allocationSize = 1 , sequenceName = "SQ_T_PASSAGEIRO")
public class Passageiro implements Serializable{

	private static final long serialVersionUID = -110636361426434176L;

	@Id
	@Column(name = "cd_passageiro")
	@GeneratedValue(generator = "passageiro" , strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_passageiro" , length = 100 , nullable = false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNascimento;
	
	@Enumerated(EnumType.STRING)
	private GeneroEnum genero;
	
	@OneToMany(mappedBy="passageiro")
	private List<Corrida> corridas;

	public Passageiro() {
		
	}
	
	public Passageiro(String nome, Calendar dataNascimento, GeneroEnum genero) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}
	
	
	
}

