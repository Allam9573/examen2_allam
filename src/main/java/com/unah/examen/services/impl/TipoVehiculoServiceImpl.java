package com.unah.examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen.modelos.TipoVehiculo;
import com.unah.examen.repositories.TipoVehiculoRepository;
import com.unah.examen.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        TipoVehiculo nvoTipoVehiculo = this.tipoVehiculoRepository.save(tipoVehiculo);
        return nvoTipoVehiculo;
    }

}
