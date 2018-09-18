package com.exact.service.lugares.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.lugares.entity.Distrito;
import com.exact.service.lugares.entity.Provincia;

@Repository
public interface IDistritoDao extends CrudRepository<Distrito, Long> {
	@Query(value="SELECT * FROM distrito where provincia_id = ?1", nativeQuery=true)
	public Iterable<Distrito> findAllByProvinciaId(Long provinciaId);
}
