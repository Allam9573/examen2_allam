package com.unah.examen.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen.modelos.Vehiculo;
import com.unah.examen.repositories.VehiculoRepository;
import com.unah.examen.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        Vehiculo nvoVehiculo = this.vehiculoRepository.save(vehiculo);
        return nvoVehiculo;
    }

    @Override
    public List<Vehiculo> listarVehiculos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo buscarVehiculoId(int id) {
        return this.vehiculoRepository.findById(id).get();
    }

}
