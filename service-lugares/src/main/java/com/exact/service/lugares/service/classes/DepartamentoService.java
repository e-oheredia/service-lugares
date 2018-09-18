package com.exact.service.lugares.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.lugares.dao.IDepartamentoDao;
import com.exact.service.lugares.entity.Departamento;
import com.exact.service.lugares.service.interfaces.IDepartamentoService;

@Service
public class DepartamentoService implements IDepartamentoService {
	
	@Autowired
	private IDepartamentoDao departamentoDao;
	
	@Override
	public Iterable<Departamento> listarAll() {
		return departamentoDao.findAll();
	}

	@Override
	public Iterable<Departamento> listarDepartamentosByPaisId(Long paisId) {
		return departamentoDao.findAllByPaisId(paisId);
	}

}
