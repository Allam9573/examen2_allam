package com.unah.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen.modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{
    
}
