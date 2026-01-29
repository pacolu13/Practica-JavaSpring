package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.repositories;

import java.util.List;
import java.util.Optional;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Libro;

public interface I_RepoLibros {
    List<Libro> findAll();

    Optional<Libro> findById(long id);

    void save(Libro libro);

    void deleteById(long id);
}
