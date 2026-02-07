package com.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.DTOs.ArticuloDTO;
import com.libreria.services.ServicioArticulo;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/articulo")
public class ControladorArticulo {

    @Autowired
    private ServicioArticulo servicio;
    
    @GetMapping
    public List<ArticuloDTO> listar(){
        return servicio.consulta();
    }

    @GetMapping("/{id}")
    public ArticuloDTO buscarPorId(@PathVariable Long id){
        return servicio.buscarPorId(id);
    }
    
    @PostMapping
    public ArticuloDTO insertarArticulo(@RequestBody ArticuloDTO dto){
        return servicio.insertarArticulo(dto);
    }

    @PutMapping("/{id}")
    public ArticuloDTO putMethodName(@PathVariable Long id, @RequestBody ArticuloDTO dto) {
        return servicio.actualizarArticulo(id, dto);
    }

    @DeleteMapping("/{id}")
    public StringBuilder eliminarArticulo(@PathVariable Long id){
        return servicio.eliminarArticulo(id);
    }
}
