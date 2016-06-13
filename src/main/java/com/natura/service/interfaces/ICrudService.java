package com.natura.service.interfaces;

import java.util.List;


public interface ICrudService<T, DTO> {
	T salvarOuAtualizar(T entidade);
	List<DTO> buscar();
}