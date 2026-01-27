package com.pruebaconfig.spring.apprueba.springboot_aplicaciones.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaconfig.spring.apprueba.springboot_aplicaciones.models.Empleados;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // Definimos un controlador, como es Rest devuelve en formato JSON
@RequestMapping("/api/variable") //Esta va a ser la ruta raiz de nuestra API - IMPORTANTE - 
public class PathVariableController {

    // Valores que vienen desde el archivo application.properties
    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/paginaEjemplo/{mensaje}")
    public ParametroDTO paginaEjemplo(@PathVariable String mensaje) {
        ParametroDTO parametroEj = new ParametroDTO();
        parametroEj.setInformacion(mensaje);
        return parametroEj;
    };

    @PostMapping("/solicitud")
    public Empleados crearEmpleado(@RequestBody Empleados emp) {

        return emp;
    }

    @GetMapping("/valores")
    public Map<String, Object> values() {
        Map<String, Object> json = new HashMap();
        json.put("usuario", usuario);
        json.put("mensaje", mensaje);
        json.put("valores", valores);

        return json;
    }

}
