package com.unah.examen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unah.examen.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer>{
    
}
