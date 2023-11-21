package com.unah.examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen.modelos.TipoCliente;
import com.unah.examen.repositories.TipoClienteRepository;
import com.unah.examen.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {
        TipoCliente nvoTipoCliente = this.tipoClienteRepository.save(tipoCliente);
        return nvoTipoCliente;
    }

}
