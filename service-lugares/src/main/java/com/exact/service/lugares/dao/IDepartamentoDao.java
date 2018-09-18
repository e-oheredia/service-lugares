package com.exact.service.lugares.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.service.lugares.entity.Departamento;

@Repository
public interface IDepartamentoDao extends CrudRepository<Departamento, Long>{
	@Query(value="SELECT * FROM departamento where pais_id = ?1", nativeQuery=true)
	public Iterable<Departamento> findAllByPaisId(Long paisId);
}
