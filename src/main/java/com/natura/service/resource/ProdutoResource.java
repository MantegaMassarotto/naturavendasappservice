package com.natura.service.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.natura.service.dto.ProdutoDto;
import com.natura.service.exception.CrudResourceException;
import com.natura.service.interfaces.ICrudService;
import com.natura.service.model.Produto;
import com.natura.service.service.ProdutoService;

@Controller
@RequestMapping("/rest/produto/")
public class ProdutoResource extends CrudResourceTemplate<Produto, ProdutoDto> {
	
	@Autowired
	private ProdutoService service;
	
	@Override
	public ICrudService<Produto, ProdutoDto> getService() throws CrudResourceException {
		return service;
	}
}
