package com.exact.service.lugares.service.interfaces;

import java.util.List;

import com.exact.service.lugares.entity.Distrito;

public interface IDistritoService {	
	
	Distrito listarById(Long id);
	boolean existeById(Long id);
	Iterable<Distrito> listarByIds(List<Long> ids);
	Iterable<Distrito> listarByProvinciaId(Long provinciaId);
	Iterable<Distrito> listarAll();
}
