package com.unah.examen.services;

import java.util.List;

import com.unah.examen.modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> listarClientes();

    public Cliente buscarClienteId(int id);

}
