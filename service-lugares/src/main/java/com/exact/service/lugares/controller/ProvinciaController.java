package com.exact.service.lugares.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.service.lugares.entity.Distrito;
import com.exact.service.lugares.entity.Provincia;
import com.exact.service.lugares.service.interfaces.IDistritoService;
import com.exact.service.lugares.service.interfaces.IProvinciaService;

@RestController
@RequestMapping("provincias")
public class ProvinciaController {
	
	@Autowired
	IDistritoService distritoService;
	
	@Autowired
	IProvinciaService provinciaService;
	
	@GetMapping("/{id}/distritos")
	public ResponseEntity<Iterable<Distrito>> listarDistritosByProvinciaId(@PathVariable Long id){
		return new ResponseEntity<Iterable<Distrito>>(distritoService.listarByProvinciaId(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Provincia>> listarAll(){
		return new ResponseEntity<Iterable<Provincia>>(provinciaService.listarAll(), HttpStatus.OK);
	}
}
