package com.corenetworks.Excepciones.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDate;

@RestController
@ControllerAdvice
public class ControladorExcepciones extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ExcepcionPersonalizadaNoEncontrado.class)
    public ResponseEntity<ExcepcionRespuesta> catchDeNoEncontrado
            (ExcepcionPersonalizadaNoEncontrado ex, WebRequest peticion){
        //Crear un objeto de ExcepcionRespuesta
        ExcepcionRespuesta e1 = new ExcepcionRespuesta(LocalDate.now(),ex.getMessage(),
                peticion.getDescription(false));
        //Devolverla
        return new ResponseEntity<>(e1, HttpStatus.NOT_FOUND);
    }
       @ExceptionHandler(Exception.class)
       public final ResponseEntity<ExcepcionRespuesta> catchTodaslasExcepciones
            (Exception ex, WebRequest peticion){
           //Crear un objeto de ExcepcionRespuesta
           ExcepcionRespuesta e1 = new ExcepcionRespuesta(LocalDate.now(),ex.getMessage(),
                   peticion.getDescription(false));
           //Devolverla
           return new ResponseEntity<>(e1, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
