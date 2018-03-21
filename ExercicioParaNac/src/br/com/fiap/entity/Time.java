package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.fiap.categoriaEnum.Categoria;

@Entity
@Table(name = "T_TIME")
@SequenceGenerator(name="team" , sequenceName = "SQ_T_TIME" , allocationSize = 1)
public class Time implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "team" , strategy=GenerationType.SEQUENCE)
	@Column(name = "cd_time")
	private int cd;
	
	@Column(name = "nm_time" , length = 100 , nullable = false)
	private String nome;
	
	@Column(name = "ds_categoria")
	@Enumerated(EnumType.STRING)
	private Categoria categoria;
	
	@OneToOne
	private Tecnico tecnico;

	@ManyToMany()
	//PEGANDO OS CD'S DESSA TABELA E DPS O DA OUTRA
	@JoinTable(name = "T_TIME_CAMPEONATO" , joinColumns = @JoinColumn(name = "CD_TIME") ,  
			  inverseJoinColumns =@JoinColumn(name = "CD_CAMPEONATO"))
	private List<Campeonato>camp;

	public Time(String nome, Categoria categoria, Tecnico tecnico, List<Campeonato> camp) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.tecnico = tecnico;
		this.camp = camp;
	}

	public List<Campeonato> getCamp() {
		return camp;
	}

	public void setCamp(List<Campeonato> camp) {
		this.camp = camp;
	}

	public Time(){
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	

	
	
}
