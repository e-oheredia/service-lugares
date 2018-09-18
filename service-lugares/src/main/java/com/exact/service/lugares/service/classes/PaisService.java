package com.exact.service.lugares.service.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.service.lugares.dao.IPaisDao;
import com.exact.service.lugares.entity.Pais;
import com.exact.service.lugares.service.interfaces.IPaisService;

@Service
public class PaisService implements IPaisService {
	
	@Autowired
	IPaisDao paisDao;
	
	@Override
	public Iterable<Pais> listarAll() {
		return paisDao.findAll();
	}

}
