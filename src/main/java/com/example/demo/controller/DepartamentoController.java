package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Departamento;
import com.example.demo.service.DepartamentoService;

@RestController
@RequestMapping("/api/depa")
public class DepartamentoController {
	@Autowired(required=true)
	private DepartamentoService service;
	
	@GetMapping("/listar")
	public List<Departamento> asignarDepa(){
		
		
		return service.asignarClienteDepartamento();
	}

}
