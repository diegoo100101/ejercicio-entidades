package com.ejercicioEntidades.entidades.controller;

import com.ejercicioEntidades.entidades.model.Vuelo;
import com.ejercicioEntidades.entidades.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    @Autowired
    private VueloRepository vueloRepository;

    @GetMapping("/all")
    public List<Vuelo> all() {
        return vueloRepository.findAll();
    }
}
