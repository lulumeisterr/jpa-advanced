package br.com.fiap.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "T_CAMPEONATO")
@SequenceGenerator(name = "campeonato" , sequenceName = "SQ_T_CAMPEONATO" ,  allocationSize = 1)
public class Campeonato implements Serializable {


	private static final long serialVersionUID = 7900507345779354544L;

	@Id
	@GeneratedValue(generator = "campeonato" , strategy = GenerationType.SEQUENCE)
	@Column(name = "cd_campeonato")
	
	private int campeonato;
	
	@Column(name = "nm_campeonato" , nullable = false , length = 100)
	private String nome;

	
	@ManyToMany(mappedBy = "camp")
	private List<Time> time;
	

	public Campeonato(){
		
	}
	
	public Campeonato(int campeonato, String nome, List<Time> time) {
		super();
		this.campeonato = campeonato;
		this.nome = nome;
		this.time = time;
	}



	public int getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(int campeonato) {
		this.campeonato = campeonato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	

	
	
	
	
}
