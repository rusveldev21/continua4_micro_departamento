package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Cliente;


//nombre del microservicio a consumir:idat-ESTUDIANTE del properties, generado x instancia
@FeignClient(name = "idat-estudiante", url = "localhost:56082")
public interface OpenFeingClient {
	
	@GetMapping("api/cliente/listar")
	public List<Cliente> listarCliente();
}
