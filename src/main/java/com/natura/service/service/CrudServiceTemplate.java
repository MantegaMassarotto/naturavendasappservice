package com.natura.service.service;

import com.natura.service.interfaces.ICrudRepository;
import com.natura.service.interfaces.ICrudService;

public abstract class CrudServiceTemplate<T, DTO> implements ICrudService<T, DTO> {
	
	@Override
	public T salvarOuAtualizar(T entidade) {
		return getRepo().saveAndFlush(entidade);
	}

	public abstract ICrudRepository<T> getRepo();
}