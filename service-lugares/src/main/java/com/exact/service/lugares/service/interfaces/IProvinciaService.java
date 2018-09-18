package com.exact.service.lugares.service.interfaces;

import com.exact.service.lugares.entity.Provincia;

public interface IProvinciaService {
	
	public Iterable<Provincia> listarProvinciasByDepartamentoId(Long departamentoId);
	Iterable<Provincia> listarAll();

}
