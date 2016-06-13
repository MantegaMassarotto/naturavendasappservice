package com.natura.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Murillo on 13/06/2015.
 */
@Entity
public class Produto extends EntidadeBase {

	@Column
	private String nome;
	@Column
	private Double valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
