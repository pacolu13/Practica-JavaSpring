package com.libreria.repositories;

import java.util.List;
import java.util.Optional;

import com.libreria.models.Libro;

public interface I_RepoLibros {
    List<Libro> findAll();

    Optional<Libro> findById(long id);

    void save(Libro libro);

    void deleteById(long id);
}
