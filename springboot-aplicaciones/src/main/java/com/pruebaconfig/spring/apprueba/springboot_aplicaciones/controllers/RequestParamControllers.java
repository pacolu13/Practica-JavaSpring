package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequestParamControllers {

    @GetMapping("/detalle")
    //DTO -> Informacion encapsulada que se envia al cliente
    public ParametroDTO detalle(@RequestParam(required = false) String informacion){
        ParametroDTO parametro = new ParametroDTO();
        parametro.setInformacion(informacion);
        return parametro;
    }
    
}
