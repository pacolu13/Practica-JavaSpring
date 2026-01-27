package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Empleados;

import org.springframework.web.bind.annotation.GetMapping;


@RestController //API Rest, comunicacion entre sistemas usando solicitudes
@RequestMapping("/api") // Ruta superior para servidores de tipo GET
public class EjemploRestController { 

    @GetMapping(path = "/detalles_info_dos")
    
    //@RequestMapping(path = "/detalles_info_dos", method = RequestMethod.GET)
    
    public Map<String, Object> detalles_info_dos(){
        Empleados empleado1 = new Empleados("Luca","Velazquez",null,"Docente",23,1127483106,1);
        Map<String, Object > respuesta = new HashMap<>();
        
        respuesta.put("Empleado","Datos empleado");
        respuesta.put("Empleado",empleado1);

        return respuesta; //Lo retorna en formato JSON
    }

    /*
    public ArrayList<Persona> detalles_info_dos(){
        ArrayList<Persona> personas = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            Persona p1 = new Persona("Luca","Velazquez",23);
            personas.add(p1);
        }
        
        return personas;
    }
     */
         
}
