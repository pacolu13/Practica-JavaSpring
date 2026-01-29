package com.libreria.services;

import java.util.List;
import java.util.Optional;

import com.libreria.models.Libro;

public interface I_ServicioLibro {
    List<Libro>ObtenerTodos();
    Optional<Libro>obtenerPorId(long id);
    Libro guardar(Libro libro);
    void eliminarPorId(long id);
    String buscarLibroPorTitulo(String titulo);

}
