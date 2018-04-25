package br.com.fiap.jpa.entity;



import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.fiap.jpa.consultasPKS.ConsultaPK;

@Entity
@Table(name = "T_CONSULTA")
@IdClass(ConsultaPK.class) // Avisando que a classe que mapeia o ainda é está
public class Consulta {

	@Column(name = "DT_CONSULTA")
	@Temporal(TemporalType.TIMESTAMP)
	@Id
	private Calendar consulta;
	
	@Column(name = "ds_consultorio")
	private String consultorio;
	
	@Column(name = "ST_CONVENIO")
	private boolean convenio;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "nr_crm")
	@Id
	private Medico medico;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cd_paciente")
	@Id
	private Paciente paciente;

	
	public Consulta() {
		
	}


	public Consulta(Calendar consulta, String consultorio, boolean convenio) {
		super();
		this.consulta = consulta;
		this.consultorio = consultorio;
		this.convenio = convenio;

	}

	public Calendar getConsulta() {
		return consulta;
	}


	public void setConsulta(Calendar consulta) {
		this.consulta = consulta;
	}


	public String getConsultorio() {
		return consultorio;
	}


	public void setConsultorio(String consultorio) {
		this.consultorio = consultorio;
	}


	public boolean isConvenio() {
		return convenio;
	}


	public void setConvenio(boolean convenio) {
		this.convenio = convenio;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	

	
	
	
	
}
