package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.repositorios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Libros;

@Repository
public class RepoLibros {
    private final List<Libros> libros = new ArrayList<>();

    public RepoLibros(){
        libros.add(new Libros(1, "Luca", "T1", LocalDate.of(1605, 1, 16)));
        libros.add(new Libros(2, "Pao", "T2", LocalDate.of(1907, 8, 26)));
        libros.add(new Libros(3, "Marce", "T3", LocalDate.of(1295, 5, 16)));
        libros.add(new Libros(4, "Naomi", "T4", LocalDate.of(2005, 11, 11)));
    }

    public List<Libros> findAll(){
        return libros;
    }

    public Optional<Libros>BuscaId(long idLibro){
        return libros.stream().filter(libros1 -> libros1.getIdLibro() == idLibro).findFirst();
    }
}
