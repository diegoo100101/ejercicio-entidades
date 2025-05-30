package com.ejercicioEntidades.entidades.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "ruta")
@Getter
@Setter
public class Ruta implements Serializable {

    @Id
    @Column(name = "id_ruta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRuta;

    @Column(name = "ds_descripcion")
    private String dsDescripcion;
}
