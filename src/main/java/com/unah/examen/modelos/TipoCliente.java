package com.unah.examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tipocliente")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TipoCliente {

    @Id
    @Column(name = "idtipocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCliente;
    @Column(name = "descripcion")
    private String descripcion;

    

    

}
