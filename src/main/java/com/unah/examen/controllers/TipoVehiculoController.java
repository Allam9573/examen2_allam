package com.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen.modelos.TipoVehiculo;
import com.unah.examen.services.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping(value = "/api/tipo-vehiculos")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping(value = "/crear-tipo-vehiculo")
    public TipoVehiculo nuevoTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo) {
        TipoVehiculo nvoTipoVehiculo = this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
        return nvoTipoVehiculo;
    }

}
