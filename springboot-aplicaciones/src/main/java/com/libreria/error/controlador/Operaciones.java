package com.libreria.error.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api/division")
public class Operaciones {

    @GetMapping
    public String Divide(@RequestParam String numero) {
        int valor = Integer.parseInt(numero);
        int resultado = 20 / valor;
        return "Resultado: " + resultado;
    }
}

@RestController
class ObjetoNull {

    @GetMapping("valornulo")
    public String nulo() {
        String valorNulo = null;
        System.out.println(valorNulo);

        return "Valor nulo en la variable";
    }

}
