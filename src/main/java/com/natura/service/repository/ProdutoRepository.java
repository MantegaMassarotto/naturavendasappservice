package com.natura.service.repository;

import org.springframework.stereotype.Component;

import com.natura.service.interfaces.ICrudRepository;
import com.natura.service.model.Produto;

@Component
public interface ProdutoRepository extends ICrudRepository<Produto> {}
