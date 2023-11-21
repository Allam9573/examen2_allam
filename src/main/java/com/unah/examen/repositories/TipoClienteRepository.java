package com.unah.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
