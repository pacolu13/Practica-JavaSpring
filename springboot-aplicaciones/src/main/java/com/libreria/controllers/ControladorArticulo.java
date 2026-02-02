package com.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.DTOs.ArticuloDTO;
import com.libreria.services.ServicioArticulo;

@RestController
@RequestMapping("/api/articulo")
public class ControladorArticulo {

    @Autowired
    private ServicioArticulo servicio;
    
    @GetMapping
    public List<ArticuloDTO> listar(){
        return servicio.consulta();
    }
}
