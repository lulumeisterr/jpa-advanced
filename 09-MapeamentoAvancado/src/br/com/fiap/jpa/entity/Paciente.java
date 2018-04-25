package br.com.fiap.jpa.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_PACIENTE")
@SequenceGenerator(name = "paciente" , allocationSize = 1 , sequenceName="SQ_T_PACIENTE")
public class Paciente {

	@Id
	@Column(name = "cd_codigo")
	@GeneratedValue(generator = "paciente" , strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "ds_nome")
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO")
	private Calendar dtNascimento;
	
	public Paciente() {
		super();
	}
	
	
	public Paciente(String nome, Calendar dtNascimento) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
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

	public Calendar getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Calendar dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
	
}
