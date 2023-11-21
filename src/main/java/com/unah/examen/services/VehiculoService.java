package com.unah.examen.services;

import java.util.List;
import java.util.Optional;

import com.unah.examen.modelos.Vehiculo;

public interface VehiculoService {

    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> listarVehiculos();

    public Vehiculo buscarVehiculoId(int id);

}
