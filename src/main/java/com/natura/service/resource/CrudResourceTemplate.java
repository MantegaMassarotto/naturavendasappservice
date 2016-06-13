package com.natura.service.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.natura.service.exception.CrudResourceException;
import com.natura.service.interfaces.ICrudResource;
import com.natura.service.interfaces.ICrudService;

public abstract class CrudResourceTemplate<T, DTO> implements ICrudResource<T, DTO> {
	
	@RequestMapping(value = "buscar/", method = RequestMethod.GET)
	public @ResponseBody
	List<DTO> buscar() throws CrudResourceException {
		return getService().buscar();
	}
	
	public abstract ICrudService<T, DTO> getService() throws CrudResourceException;
}