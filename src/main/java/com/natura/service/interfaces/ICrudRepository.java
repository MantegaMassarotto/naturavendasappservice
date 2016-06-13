package com.natura.service.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ICrudRepository<T> extends JpaRepository<T, Long> {
	
	@Override
	public T saveAndFlush(T entity);
}