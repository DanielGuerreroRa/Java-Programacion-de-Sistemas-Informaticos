package com.corenetworks.modelo;

public enum EstadoCivilAvanzado {
    CASADO("Casado"),
    DIVORCIADO("Divorciado"),
    SOLTERO("Soltero"),
    VIUDO("Viudo"),
    OTRO("Otro");


    //Métodos
    private final String descripcion;

    //Constructor
    private EstadoCivilAvanzado(String descripcion){
        this.descripcion=descripcion;
    }
    //Setters

    public String getDescripcion() {
        return descripcion;
    }
}
