package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Libro;

@Repository
public class RepoLibros {
    private final List<Libro> libros = new ArrayList<>();

    public RepoLibros() {
        libros.add(new Libro(1, "Luca", "T1", LocalDate.of(1605, 1, 16)));
        libros.add(new Libro(2, "Pao", "T2", LocalDate.of(1907, 8, 26)));
        libros.add(new Libro(3, "Marce", "T3", LocalDate.of(1295, 5, 16)));
        libros.add(new Libro(4, "Naomi", "T4", LocalDate.of(2005, 11, 11)));
    }

    public List<Libro> findAll() {
        return libros;
    }

    //Expresion lambda
    public Optional<Libro> BuscaId(long idLibro) {
        return libros.stream().filter(libros1 -> libros1.getIdLibro() == idLibro).findFirst();
    }
}
