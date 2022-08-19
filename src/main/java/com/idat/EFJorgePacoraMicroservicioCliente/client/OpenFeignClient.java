package com.idat.EFJorgePacoraMicroservicioCliente.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.idat.EFJorgePacoraMicroservicioCliente.dto.PizzaDTO;

@FeignClient(name = "servicio-pizza", url="localhost:8085")
public interface OpenFeignClient {
	
	@GetMapping("/api/v1/pizza/listar")
	public List<PizzaDTO> listadoPizzas();
	
	
	@PostMapping("/api/v1/pizza/guardar")
	public List<PizzaDTO> guardarPizzas();	
	

}
