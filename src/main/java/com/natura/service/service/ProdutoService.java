package com.natura.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natura.service.dto.ProdutoDto;
import com.natura.service.function.ProdutoEntityToDto;
import com.natura.service.interfaces.ICrudRepository;
import com.natura.service.model.Produto;
import com.natura.service.repository.ProdutoRepository;

@Service
public class ProdutoService extends CrudServiceTemplate<Produto, ProdutoDto> {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public ICrudRepository<Produto> getRepo() {
		return repository;
	}

	@Override
	public List<ProdutoDto> buscar() {
		List<ProdutoDto> produtosDto = new ArrayList<ProdutoDto>();

		List<Produto> produtos = getRepo().findAll();
		if(produtos != null && !produtos.isEmpty()) 
			produtosDto = new ProdutoEntityToDto().apply(produtos);
		return produtosDto;
	}
}
