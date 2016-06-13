package com.natura.service.function;

import java.util.ArrayList;
import java.util.List;

import com.natura.service.dto.ClienteDto;
import com.natura.service.model.Cliente;

/**
 * Created by Murillo on 12/06/2016.
 */
public class ClienteEntityToDto {

    public List<ClienteDto> apply(List<Cliente> Clientes) {
        List<ClienteDto> ClientesDto = new ArrayList<ClienteDto>();
        for(Cliente p : Clientes) {
        	ClientesDto.add(apply(p));
        }
        return ClientesDto;
    }
    
    public ClienteDto apply(Cliente cliente) {
    	ClienteDto pDto = new ClienteDto();
    	pDto.setId(cliente.getId());
    	pDto.setNome(cliente.getNome());
    	return pDto;
    }
}
