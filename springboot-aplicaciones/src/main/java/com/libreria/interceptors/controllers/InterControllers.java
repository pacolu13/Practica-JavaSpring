package com.libreria.interceptors.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class InterControllers {
    @GetMapping("/saludos")
    public String saludar(){
        return "Probando interceptores";
    }
    
}
