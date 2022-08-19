package com.idat.EFJorgePacoraMicroservicioCliente.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.EFJorgePacoraMicroservicioCliente.modelo.Cliente;
import com.idat.EFJorgePacoraMicroservicioCliente.servicio.ClienteServicio;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteControlador {
	
	@Autowired
	private ClienteServicio servicio; 
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarClientes() {
		return servicio.listarClientes(); 
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarCliente(@RequestBody Cliente cliente) {
		servicio.guardarClientes(cliente);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void AsignarPizzas() {
		servicio.asignarPizzas();
	}

}
