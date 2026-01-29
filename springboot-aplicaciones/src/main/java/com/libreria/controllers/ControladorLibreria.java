package com.libreria.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.models.Libro;
import com.libreria.repositories.I_RepoLibros;
import com.libreria.services.I_ServicioLibro;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final I_ServicioLibro i_servicio;
    private final I_RepoLibros i_repo;

    public ControladorLibreria(I_ServicioLibro i_servicio, I_RepoLibros i_repo) {
        this.i_servicio = i_servicio;
        this.i_repo = i_repo;
    }

    @GetMapping("/all")
    public List<Libro> getAll() {
        return i_servicio.ObtenerTodos();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Libro> obtenerPorId(@PathVariable long id) {
        Optional<Libro> libro = i_servicio.obtenerPorId(id);
        return libro.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Libro>crear(@RequestBody Libro libro){
        i_servicio.guardar(libro);
        return ResponseEntity.ok(libro);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Libro>borrar(@PathVariable long id){
        i_servicio.eliminarPorId(id);
        return ResponseEntity.noContent().build();
    }
    
}
