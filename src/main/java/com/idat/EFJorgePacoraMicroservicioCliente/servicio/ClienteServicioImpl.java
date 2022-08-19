package com.idat.EFJorgePacoraMicroservicioCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EFJorgePacoraMicroservicioCliente.client.OpenFeignClient;
import com.idat.EFJorgePacoraMicroservicioCliente.dto.PizzaDTO;
import com.idat.EFJorgePacoraMicroservicioCliente.modelo.Cliente;
import com.idat.EFJorgePacoraMicroservicioCliente.modelo.ClienteDetalle;
import com.idat.EFJorgePacoraMicroservicioCliente.modelo.ClientePizzaFK;
import com.idat.EFJorgePacoraMicroservicioCliente.repositorio.ClientePizzaRepositorio;
import com.idat.EFJorgePacoraMicroservicioCliente.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	@Autowired
	private ClientePizzaRepositorio clientepizzarepositorio;
	
	@Autowired
	private OpenFeignClient feignClient;
	

	@Override
	public List<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public void guardarClientes(Cliente cliente) {
		repositorio.save(cliente);		
	}

	@Override
	public void asignarPizzas() {
		List<PizzaDTO> listado = feignClient.listadoPizzas();
		ClienteDetalle detalle = null;
		ClientePizzaFK fk = null;
		
		for(PizzaDTO pizzaDTO : listado) {
			detalle = new ClienteDetalle();
			fk = new ClientePizzaFK();			
			fk.setIdPizza(pizzaDTO.getIdPizza()); 
			fk.setIdCliente(1);  		
			detalle.setFk(fk);
			clientepizzarepositorio.save(detalle);
		}		
		
	}
}
