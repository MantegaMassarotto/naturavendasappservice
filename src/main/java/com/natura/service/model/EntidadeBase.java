package com.natura.service.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;


@MappedSuperclass
public class EntidadeBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "seq_hibernate", sequenceName = "seq_hibernate", allocationSize = 1)
	@GeneratedValue(generator = "seq_hibernate", strategy = GenerationType.AUTO)
	private Long id;


	/*
	 * GETTERS E SETTERS
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}