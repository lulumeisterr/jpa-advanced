package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_FUNCIONARIO")
@SequenceGenerator(name="funcionario" , sequenceName = "SQ_TB_FUNCIONARIO" , allocationSize=1)

public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 7781545238999436062L;
	
	@GeneratedValue(generator="funcionario" ,  strategy = GenerationType.SEQUENCE)
	@Id
	
	@Column(name = "cd_funcionario")
	private int cdfuncionario;
	
	@Column(name = "nm_funcionario" , nullable = false , length = 100)
	private String nm_funcionario;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_admissao" , nullable = false)
	private Calendar dt_admissao;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento" , nullable = false)
	private Calendar dt_nascimento;
	
	@Column(name = "vl_salario")
	private double vl_salario;
	
	@Lob
	@Column(name = "ft_foto")
	private byte[] foto;
	
	@Enumerated(EnumType.ORDINAL)
	private EnumEscolaridade ds_escolaridade;
	
	public Funcionario(){
		
	}
	
	public Funcionario(String nm_funcionario, Calendar dt_admissao, Calendar dt_nascimento,
			double vl_salario, byte[] foto, EnumEscolaridade ds_escolaridade) {
		super();
		
		this.nm_funcionario = nm_funcionario;
		this.dt_admissao = dt_admissao;
		this.dt_nascimento = dt_nascimento;
		this.vl_salario = vl_salario;
		this.foto = foto;
		this.ds_escolaridade = ds_escolaridade;
	}



	public int getCdfuncionario() {
		return cdfuncionario;
	}

	public void setCdfuncionario(int cdfuncionario) {
		this.cdfuncionario = cdfuncionario;
	}

	public String getNm_funcionario() {
		return nm_funcionario;
	}

	public void setNm_funcionario(String nm_funcionario) {
		this.nm_funcionario = nm_funcionario;
	}

	public Calendar getDt_admissao() {
		return dt_admissao;
	}

	public void setDt_admissao(Calendar dt_admissao) {
		this.dt_admissao = dt_admissao;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public double getVl_salario() {
		return vl_salario;
	}

	public void setVl_salario(double vl_salario) {
		this.vl_salario = vl_salario;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public EnumEscolaridade getDs_escolaridade() {
		return ds_escolaridade;
	}

	public void setDs_escolaridade(EnumEscolaridade ds_escolaridade) {
		this.ds_escolaridade = ds_escolaridade;
	}

}
