package com.libreria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Articulo {
    @Id //Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //anotacion para generacion de valor automatico
    private Long id;
    private String nombre;
    private Double precio;
    private Integer cantStock;

    //Lombok realizar el constructor en tiempo de ejecucion junto con los getters y setters 
    //¿que pasa si se quieren usar los metodos?

}
