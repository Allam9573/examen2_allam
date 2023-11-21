package com.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen.modelos.TipoCliente;
import com.unah.examen.services.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping(value = "/api/tipo-clientes")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping(value = "/crear-tipo-cliente")
    public TipoCliente nuevoTipoCliente(@RequestBody TipoCliente tipoCliente) {
        TipoCliente nvTipoCliente = this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
        return nvTipoCliente;
    }

}
