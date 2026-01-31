package com.libreria.error.servicio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class FileContent {

    public String lecturaArchivo(String ruta) {
        try {
            Path v_ruta = Paths.get(ruta);
            return Files.readString(v_ruta);
        } catch (IOException ERROR) {
            throw new RuntimeException("Error en lectura de archivo"
                    + ERROR.getMessage(), ERROR);
        }
    }
}
