package com.unah.examen.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen.modelos.Vehiculo;

@RestController
@RequestMapping(value = "/api/vehiculos")
public class VehiculoController {

    @PostMapping(value = "/crear")
    public Vehiculo crearVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculo;
    }

}
