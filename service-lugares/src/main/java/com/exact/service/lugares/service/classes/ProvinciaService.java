package com.exact.service.lugares.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.lugares.dao.IProvinciaDao;
import com.exact.service.lugares.entity.Provincia;
import com.exact.service.lugares.service.interfaces.IProvinciaService;

@Service
public class ProvinciaService implements IProvinciaService {
	
	@Autowired
	IProvinciaDao provinciaDao;
	
	@Override
	public Iterable<Provincia> listarProvinciasByDepartamentoId(Long departamentoId) {
		return provinciaDao.findAllByDepartamentoId(departamentoId);
	}

	@Override
	public Iterable<Provincia> listarAll() {
		return provinciaDao.findAll();
	}

}
