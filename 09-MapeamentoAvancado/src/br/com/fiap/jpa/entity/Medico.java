package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.fiap.jpa.enums.EnumEspecialidade;

@Entity
@Table(name = "T_MEDICO")
public class Medico {
	
	@Id
	@Column(name = "nr_crm")
	private int id;
	
	@Column(name = "nm_medico")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_especialidade")
	private EnumEspecialidade esp;
	
	
	public Medico() {
		
	}
	
	public Medico(int id, String nome, EnumEspecialidade esp) {
		super();
		this.id = id;
		this.nome = nome;
		this.esp = esp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnumEspecialidade getEsp() {
		return esp;
	}

	public void setEsp(EnumEspecialidade esp) {
		this.esp = esp;
	}
	
	
	

}
