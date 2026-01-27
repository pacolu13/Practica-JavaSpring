package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController //Definimos un controlador, como es Rest devuelve en formato JSON
@RequestMapping("/api/variable")
public class PathVariableController {

    @GetMapping("/paginaEjemplo/{mensaje}")
    public ParametroDTO paginaEjemplo(@PathVariable String mensaje) {
        ParametroDTO parametroEj = new ParametroDTO();
        parametroEj.setInformacion(mensaje);
        return parametroEj;
    };
}
