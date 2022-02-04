package com.example.demo.entity;

import java.util.List;

public class Departamento {

	  List<Cliente> listadoCliente;
	  String departamento;
	public List<Cliente> getListadoCliente() {
		return listadoCliente;
	}
	public void setListadoCliente(List<Cliente> listadoEstudiante) {
		this.listadoCliente = listadoEstudiante;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String depa) {
		this.departamento = depa;
	}
}
