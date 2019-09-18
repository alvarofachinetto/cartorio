package com.cartorio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cartorio")
public class Cartorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCartorio;
	
	@Column(length = 40, nullable = false)
	private String nome;

	public Long getIdCartorio() {
		return idCartorio;
	}

	public void setIdCartorio(Long idCartorio) {
		this.idCartorio = idCartorio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cartorio() {}
	
	public Cartorio(Long idCartorio, String nome) {
		super();
		this.idCartorio = idCartorio;
		this.nome = nome;
	}
	
	
}
