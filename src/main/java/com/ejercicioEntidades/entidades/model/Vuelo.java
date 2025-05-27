package com.ejercicioEntidades.entidades.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "vuelo")
@Getter
@Setter
public class Vuelo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vuelo")
    private int idVuelo;

    @Column(name = "ds_destino")
    private String dsDestino;

    @JoinColumn(name = "id_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(fetch = FetchType.EAGER)
    private Ruta ruta;
}
