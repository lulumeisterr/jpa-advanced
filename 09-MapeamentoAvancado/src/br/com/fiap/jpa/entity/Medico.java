package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import br.com.fiap.jpa.enums.EnumEspecialidade;

@Entity
@Table(name = "T_MEDICO")

// Tabela multiplas

@SecondaryTable(name = "T_MEDICO_FINANCEIRO")


public class Medico {
	
	@Id
	@Column(name = "nr_crm")
	private int id;
	
	@Column(name = "nm_medico")
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_especialidade")
	private EnumEspecialidade esp;
	
	@Column(name = "nr_conta" , table="T_MEDICO_FINANCEIRO")
	private int conta;
	
	@Column(name = "vl_consulta" , table = "T_MEDICO_FINANCEIRO")
	private float valorConsulta;
	
	public Medico() {
		
	}
		
	public Medico(int id, String nome, EnumEspecialidade esp, int conta, float valorConsulta) {
		super();
		this.id = id;
		this.nome = nome;
		this.esp = esp;
		this.conta = conta;
		this.valorConsulta = valorConsulta;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(float valorConsulta) {
		this.valorConsulta = valorConsulta;
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
