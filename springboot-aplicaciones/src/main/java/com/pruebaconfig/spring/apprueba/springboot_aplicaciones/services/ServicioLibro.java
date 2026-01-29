package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Libro;
import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.repositories.I_RepoLibros;

@Service // Componente de servicio - Logica de negocio - bean - inyeccion de dep.
public class ServicioLibro implements I_ServicioLibro {
    private final I_RepoLibros i_repo;

    public ServicioLibro(I_RepoLibros i_repo) {
        this.i_repo = i_repo;
    }

    @Override
    public List<Libro> ObtenerTodos() {
        return i_repo.findAll();
    }

    @Override
    public Optional<Libro> obtenerPorId(long id) {
        return i_repo.findById(id);
    }

    @Override
    public Libro guardar(Libro libro) {
        i_repo.save(libro);
        return libro;
    }

    @Override
    public void eliminarPorId(long id) {
        i_repo.deleteById(id);
    }

    @Override
    public String buscarLibroPorTitulo(String titulo) {
        boolean encontrado = i_repo.findAll().stream()
                .anyMatch(libro -> libro.getTitulo() != null && libro.getTitulo().equalsIgnoreCase(titulo));
        return encontrado ? "Libro encontrado" : "Libro no encontrado";
    }

}
