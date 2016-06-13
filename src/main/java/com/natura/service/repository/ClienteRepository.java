package com.natura.service.repository;

import org.springframework.stereotype.Component;

import com.natura.service.interfaces.ICrudRepository;
import com.natura.service.model.Cliente;

@Component
public interface ClienteRepository extends ICrudRepository<Cliente> {}
