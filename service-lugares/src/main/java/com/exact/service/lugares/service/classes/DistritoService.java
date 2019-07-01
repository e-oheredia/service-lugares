package com.exact.service.lugares.service.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.lugares.dao.IDistritoDao;
import com.exact.service.lugares.entity.Distrito;
import com.exact.service.lugares.service.interfaces.IDistritoService;

@Service
public class DistritoService implements IDistritoService{
	
	@Autowired
	IDistritoDao distritoDao;
	
	@Override
	public Distrito listarById(Long id) {
		return distritoDao.findById(id).orElse(null);
	}

	@Override
	public boolean existeById(Long id) {
		return distritoDao.existsById(id);
	}

	@Override
	public Iterable<Distrito> listarByIds(List<Long> ids) {
		return distritoDao.findAllById(ids);
	}

	@Override
	public Iterable<Distrito> listarByProvinciaId(Long provinciaId) {
		return distritoDao.findAllByProvinciaId(provinciaId);
	}

	@Override
	public Iterable<Distrito> listarAll() {
		return distritoDao.findAll();
	}

	@Override
	public Iterable<Distrito> listarDistritosIdsByUbigeos(List<String> ubigeos) {
		return distritoDao.findAllByUbigeoIn(ubigeos);
	}

}
