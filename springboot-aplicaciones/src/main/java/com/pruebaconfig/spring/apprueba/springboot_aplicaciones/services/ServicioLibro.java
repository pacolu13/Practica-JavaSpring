package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.services;

import org.springframework.stereotype.Service;

@Service //Componente de servicio - Logica de negocio - bean - inyeccion de dep.
public class ServicioLibro {

    public String buscarLibro(String titulo){
        if("El quijote".equalsIgnoreCase(titulo)){
            return "Libro encontrado";
        }else{
            return "Libro no encontrado";
        }
    }

}
