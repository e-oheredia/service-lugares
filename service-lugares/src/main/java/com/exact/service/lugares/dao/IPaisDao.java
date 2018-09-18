package com.exact.service.lugares.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.lugares.entity.Pais;

@Repository
public interface IPaisDao extends CrudRepository<Pais, Long> {
	
}
