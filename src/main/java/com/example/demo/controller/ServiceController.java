package com.example.demo.controller;

import com.example.demo.entity.Anuncio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class ServiceController {
	
	
    @RequestMapping(value="/cadastrar/servico")	
	public ResponseEntity<Object> index(@RequestBody Anuncio anuncio)
	{

    	String retorno="Gravado com sucesso";
    	return new ResponseEntity<>(retorno,HttpStatus.CREATED);
	}
}
