package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.OpenFeingClient;
import com.example.demo.entity.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{
	
	@Autowired
	private OpenFeingClient cliente;
	
	@Override
	public List<Departamento> asignarClienteDepartamento() {
		List<Departamento> listarAula= new ArrayList<>();
		Departamento depa = new Departamento();
		depa.setDepartamento("40G");
		depa.setListadoCliente(cliente.listarCliente());
		listarAula.add(depa);
		
		Departamento depa1 = new Departamento();
		depa1.setDepartamento("70G");
		depa1.setListadoCliente(cliente.listarCliente());
		listarAula.add(depa1);
		
		Departamento depa2 = new Departamento();
		depa2.setDepartamento("100G");
		depa2.setListadoCliente(cliente.listarCliente());
		listarAula.add(depa2);
		
		return listarAula;
	}

}
