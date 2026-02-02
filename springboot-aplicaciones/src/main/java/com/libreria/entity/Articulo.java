package com.libreria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Articulo")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Articulo {
    @Id //Llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //anotacion para generacion de valor automatico
    @Column(name="id") //No es necesario, pero recomendable para ser bien explicito
    private Long id;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="precio")
    private Double precio;

    @Column(name="cantStock")
    private Integer cantStock;
    //Lombok realizar el constructor en tiempo de ejecucion junto con los getters y setters 
    //¿que pasa si se quieren usar los metodos?
}

