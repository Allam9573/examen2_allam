package com.unah.examen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen.modelos.Cliente;
import com.unah.examen.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping(value = "/crear-cliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        Cliente nvoCliente = this.clienteServiceImpl.crearCliente(cliente);
        return nvoCliente;
    }

    @GetMapping(value = "/listar-clientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.listarClientes();
    }

    @GetMapping(value = "/buscar-cliente/{id}")
    public Cliente buscarCliente(@PathVariable int id) {
        return this.clienteServiceImpl.buscarClienteId(id);
    }

}
