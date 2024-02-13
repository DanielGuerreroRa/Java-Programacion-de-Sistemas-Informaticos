package com.corenetworks.Validaciones.excepciones;

public class ExcepcionPersonalizadaNoEncontrado extends RuntimeException {
    //Constructor(String message)
    public ExcepcionPersonalizadaNoEncontrado(String message) {
        super(message);
    }
}