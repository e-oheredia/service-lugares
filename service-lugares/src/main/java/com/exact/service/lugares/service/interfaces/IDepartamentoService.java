package com.exact.service.lugares.service.interfaces;

import com.exact.service.lugares.entity.Departamento;


public interface IDepartamentoService {
		
	public Iterable<Departamento> listarAll();
	public Iterable<Departamento> listarDepartamentosByPaisId(Long paisId);
	
}
