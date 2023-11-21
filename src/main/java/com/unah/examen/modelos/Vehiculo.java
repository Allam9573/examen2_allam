package com.unah.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {

    @Id
    @Column(name = "idvehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    @ManyToOne
    @JoinColumn(name = "idtipovehiculo")
    private TipoVehiculo tipoVehiculo;


}
