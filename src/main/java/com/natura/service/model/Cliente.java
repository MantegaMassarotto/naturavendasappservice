package com.natura.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends EntidadeBase {
		
	@Column
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
