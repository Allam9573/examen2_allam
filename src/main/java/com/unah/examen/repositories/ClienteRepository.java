package com.unah.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
