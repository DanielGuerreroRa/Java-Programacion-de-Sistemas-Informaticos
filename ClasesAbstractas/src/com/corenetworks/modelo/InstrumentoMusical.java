package com.corenetworks.modelo;

public abstract class InstrumentoMusical {
    //Atributos
    protected String marca;

    //Métodos
    public abstract String emitirSonido() ;


    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                '}';
    }
    //Constructor
    public InstrumentoMusical() {
    }
    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }
    //Setters Getters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
}
