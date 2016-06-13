package com.natura.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import com.natura.service.exception.CrudResourceException;

@Component
public interface ICrudResource<T, DTO> {
	List<DTO> buscar() throws CrudResourceException;
}