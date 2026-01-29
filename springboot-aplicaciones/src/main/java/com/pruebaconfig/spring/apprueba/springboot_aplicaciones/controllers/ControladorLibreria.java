package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Libro;
import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.repositories.RepoLibros;
import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.services.ServicioLibro;

@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {

    private final ServicioLibro libroServicio;
    private final RepoLibros libroRepositorio;

    public ControladorLibreria(ServicioLibro libroServicio, RepoLibros libroRepositorio) {
        this.libroServicio = libroServicio;
        this.libroRepositorio = libroRepositorio;
    }

    @GetMapping("/{titulo}")
    public String dameLibro(@PathVariable String titulo) {
        return libroServicio.buscarLibro(titulo);
    }

    @GetMapping("/todos")
    public List<Libro> dameTodos() {
        return libroRepositorio.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libro> buscarId(@PathVariable long id) {
        return libroRepositorio.BuscaId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/clone")
    public String probarClon() {
        Libro original = new Libro(0, "Ejemplo", "Ej", LocalDate.MAX);
        Libro copia = original.clone();
        copia.setIdLibro(8);
        copia.setTitulo("Copia");

        return "Original: " + original.toString() + " | " + copia.toString();
    }

}
