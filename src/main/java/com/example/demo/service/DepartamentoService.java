package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Departamento;
@Service
public interface DepartamentoService {
	List<Departamento> asignarClienteDepartamento();
}
