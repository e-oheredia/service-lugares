package com.exact.service.lugares.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.lugares.entity.Provincia;

@Repository
public interface IProvinciaDao extends CrudRepository<Provincia, Long> {
	@Query(value="SELECT * FROM provincia where departamento_id = ?1", nativeQuery=true)
	public Iterable<Provincia> findAllByDepartamentoId(Long departamentoId);
}
