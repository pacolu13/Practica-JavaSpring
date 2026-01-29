package com.libreria.models;

import java.time.LocalDate;

public class Libro implements Cloneable {
    private long idLibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Libro(long idLibro, String autor, String titulo, LocalDate fechaPublicacion) {

        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(long idLibro) {
        this.idLibro = idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override // Investigar bien su utilidad, los casos aplicables y en que nos sirve
    public Libro clone() {
        try {
            return (Libro) super.clone();
        } catch (CloneNotSupportedException ERROR) {
            throw new AssertionError();
        }
    };

    @Override
    public String toString() {
        return "Libros: {" + "Id = " + idLibro + ", titulo = " + titulo + "}";
    }

    public void remove(Libro existing) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
