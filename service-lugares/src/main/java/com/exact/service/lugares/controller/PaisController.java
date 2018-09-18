package com.exact.service.lugares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.service.lugares.entity.Departamento;
import com.exact.service.lugares.entity.Pais;
import com.exact.service.lugares.service.interfaces.IDepartamentoService;
import com.exact.service.lugares.service.interfaces.IPaisService;

@RestController
@RequestMapping("/paises")
public class PaisController {
	
	@Autowired
	IPaisService paisService;
	
	@Autowired
	IDepartamentoService departamentoService;
	
	@GetMapping
	public ResponseEntity<Iterable<Pais>> listarAll() {
		return new ResponseEntity<Iterable<Pais>>(paisService.listarAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}/departamentos")
	public ResponseEntity<Iterable<Departamento>> listarDepartamentosByPaisId(@PathVariable Long id) {
		return new ResponseEntity<Iterable<Departamento>>(departamentoService.listarDepartamentosByPaisId(id), HttpStatus.OK);
	}
}
