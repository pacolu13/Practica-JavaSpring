package com.libreria.Util;

import org.springframework.stereotype.Component;

import com.libreria.models.Libro;

@Component //bean generico de Spring
public class ValidaLibro {

    public Libro libro;

    public boolean tituloValido(){
        return libro.getTitulo() != null && !Boolean.parseBoolean(libro.getTitulo());  
    }
}
