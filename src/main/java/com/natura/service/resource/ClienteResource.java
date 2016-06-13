package com.natura.service.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.natura.service.dto.ClienteDto;
import com.natura.service.exception.CrudResourceException;
import com.natura.service.interfaces.ICrudService;
import com.natura.service.model.Cliente;
import com.natura.service.service.ClienteService;

@Controller
@RequestMapping("/rest/cliente/")
public class ClienteResource extends CrudResourceTemplate<Cliente, ClienteDto> {
	
	@Autowired
	private ClienteService service;
	
	@Override
	public ICrudService<Cliente, ClienteDto> getService() throws CrudResourceException {
		return service;
	}
}
