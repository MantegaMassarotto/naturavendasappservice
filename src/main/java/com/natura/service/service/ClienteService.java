package com.natura.service.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natura.service.dto.ClienteDto;
import com.natura.service.function.ClienteEntityToDto;
import com.natura.service.interfaces.ICrudRepository;
import com.natura.service.model.Cliente;
import com.natura.service.repository.ClienteRepository;

@Service
public class ClienteService extends CrudServiceTemplate<Cliente, ClienteDto> {
	
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public ICrudRepository<Cliente> getRepo() {
		return repository;
	}

	@Override
	public List<ClienteDto> buscar() {
		List<ClienteDto> clientesDto = new ArrayList<ClienteDto>();

		List<Cliente> clientes = getRepo().findAll();
		if(clientes != null && !clientes.isEmpty()) 
			clientesDto = new ClienteEntityToDto().apply(clientes);
		return clientesDto;
	}
}
