package com.exact.service.lugares.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.service.lugares.entity.Distrito;
import com.exact.service.lugares.service.interfaces.IDistritoService;

@RestController
@RequestMapping("/distritos")
public class DistritoController {
	
	@Autowired
	IDistritoService distritoService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Distrito> listarById(@PathVariable Long id) {
		return new ResponseEntity<Distrito>(distritoService.listarById(id), HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(method=RequestMethod.HEAD, value="/{id}")
	public ResponseEntity existeById(@PathVariable Long id){
		Boolean existe = distritoService.existeById(id);
		return new ResponseEntity(existe ? HttpStatus.OK : HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(params="ids")
	public ResponseEntity<Iterable<Distrito>> listarByIds(@RequestParam List<Long> ids){
		Iterable<Distrito> distritos = distritoService.listarByIds(ids);
		return new ResponseEntity<Iterable<Distrito>>(distritos, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<Iterable<Distrito>> listarAll(){
		return new ResponseEntity<Iterable<Distrito>>(distritoService.listarAll(), HttpStatus.OK);
	}
	
}
