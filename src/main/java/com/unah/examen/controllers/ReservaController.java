package com.unah.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unah.examen.modelos.Reserva;
import com.unah.examen.services.impl.ReservaServiceImpl;

@RestController
@RequestMapping(value = "/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaServiceImpl reservaServiceImpl;

    @PostMapping(value = "/crear-reservas")
    public Reserva nuevaReserva() {
        Reserva nvaReserva = this.reservaServiceImpl.crearReserva(0, 0, 0);
        return nvaReserva;
    }

}
