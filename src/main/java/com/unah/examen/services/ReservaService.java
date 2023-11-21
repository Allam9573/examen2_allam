package com.unah.examen.services;

import com.unah.examen.modelos.Reserva;

public interface ReservaService {

    public Reserva crearReserva(int codCliente, int codVehiculo, int dias);

}
