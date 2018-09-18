package com.exact.service.lugares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.service.lugares.entity.Departamento;
import com.exact.service.lugares.entity.Provincia;
import com.exact.service.lugares.service.interfaces.IDepartamentoService;
import com.exact.service.lugares.service.interfaces.IProvinciaService;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	private IDepartamentoService departamentoService;
	
	@Autowired
	private IProvinciaService provinciaService;
	
	@GetMapping
	public ResponseEntity<Iterable<Departamento>> listarAll() {
		return new ResponseEntity<Iterable<Departamento>>(departamentoService.listarAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}/provincias")
	ResponseEntity<Iterable<Provincia>> listarProvinciasByDepartamentoId(@PathVariable Long id){
		return new ResponseEntity<Iterable<Provincia>>(provinciaService.listarProvinciasByDepartamentoId(id),HttpStatus.OK);
	}	
}
