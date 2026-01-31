package com.libreria.error.manajador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<String> handlerArithmeticException(ArithmeticException ERROR) {
        return new ResponseEntity<>("Error: division entre cero no permitida", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handlerNumberFormatException(NumberFormatException ERROR) {
        return new ResponseEntity<>("Error: el formato del valor debe ser numerico", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handlerNullPointerException(NullPointerException ERROR) {
        return new ResponseEntity<>("Error: Valor de la variable no puede ser nulo", HttpStatus.BAD_REQUEST);
    }

}
