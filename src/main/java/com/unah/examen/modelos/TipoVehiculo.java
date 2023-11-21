package com.unah.examen.modelos;

import java.util.LinkedList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipovehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {

    @Id
    @Column(name = "idtipovehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoVehiculo;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precioxhora")
    private double precioXhora;

    @OneToMany
    private List<Vehiculo> vehiculos = new LinkedList<>();

}
