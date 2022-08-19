package com.idat.EFJorgePacoraMicroservicioCliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EFJorgePacoraMicroservicioCliente.modelo.ClienteDetalle;

@Repository
public interface ClientePizzaRepositorio extends JpaRepository<ClienteDetalle, Integer>{

}
