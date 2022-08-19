package com.idat.EFJorgePacoraMicroservicioCliente.servicio;

import java.util.List;

import com.idat.EFJorgePacoraMicroservicioCliente.modelo.Cliente;

public interface ClienteServicio {
	
	public List<Cliente> listarClientes();
	public void guardarClientes(Cliente cliente);
	
	void asignarPizzas();

}
