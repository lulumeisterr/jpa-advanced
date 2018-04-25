package br.com.fiap.jpa.consultasPKS;

import java.io.Serializable;
import java.util.Calendar;

//Classe que possui os atributos que foram a chave composta

public class ConsultaPK implements Serializable{

	private static final long serialVersionUID = -3157871964946487644L;
	
	private int medico;
	private int paciente;
	private Calendar consulta;

	public ConsultaPK() {
		
	}
	
	public ConsultaPK(int medico, int paciente, Calendar consulta) {
		super();
		this.medico = medico;
		this.paciente = paciente;
		this.consulta = consulta;
	}

	public int getMedico() {
		return medico;
	}
	public void setMedico(int medico) {
		this.medico = medico;
	}
	public int getPaciente() {
		return paciente;
	}
	public void setPaciente(int paciente) {
		this.paciente = paciente;
	}
	public Calendar getConsulta() {
		return consulta;
	}
	public void setConsulta(Calendar consulta) {
		this.consulta = consulta;
	}
	
	//equals hascode , servem para comparar se os atributos sao iguais
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consulta == null) ? 0 : consulta.hashCode());
		result = prime * result + medico;
		result = prime * result + paciente;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConsultaPK other = (ConsultaPK) obj;
		if (consulta == null) {
			if (other.consulta != null)
				return false;
		} else if (!consulta.equals(other.consulta))
			return false;
		if (medico != other.medico)
			return false;
		if (paciente != other.paciente)
			return false;
		return true;
	}
	
}
