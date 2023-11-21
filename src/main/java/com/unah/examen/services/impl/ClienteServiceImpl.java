package com.unah.examen.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unah.examen.modelos.Cliente;
import com.unah.examen.repositories.ClienteRepository;
import com.unah.examen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        Cliente nvoCliente = this.clienteRepository.save(cliente);
        return nvoCliente;
    }

    @Override
    public List<Cliente> listarClientes() {
        return this.clienteRepository.findAll();
    }

    @Override
    public Cliente buscarClienteId(int id) {
        return this.clienteRepository.findById(id).get();
    }

}
