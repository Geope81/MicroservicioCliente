package com.idat.EFJorgePacoraMicroservicioCliente.modelo;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="detalle_cliente")
public class ClienteDetalle {
	
	private ClientePizzaFK fk = new ClientePizzaFK();

}
