package com.libreria.error.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.error.servicio.FileContent;

@RestController
@RequestMapping("/archivo")
public class ArchivoController {

    private final FileContent contenido;

    public ArchivoController(FileContent contenido) {
        this.contenido = contenido;
    }

    @GetMapping("/lectura")
    public ResponseEntity<String> lectura(@RequestParam String ruta) {
        try {
            String elArchivo = contenido.lecturaArchivo(ruta);
            return ResponseEntity.ok(elArchivo);
        } catch (RuntimeException ERROR) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error en la lectura del archivo" + ERROR);
        }
    }
}
