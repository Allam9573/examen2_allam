package com.unah.examen.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen.modelos.Cliente;
import com.unah.examen.repositories.ClienteRepository;
import com.unah.examen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearCliente'");
    }
    
}
