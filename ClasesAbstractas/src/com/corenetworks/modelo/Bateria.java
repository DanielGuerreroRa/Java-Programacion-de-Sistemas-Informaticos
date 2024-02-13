package com.corenetworks.modelo;

public class Bateria extends InstrumentoMusical{
    //Atributos
    private int numPlatillos;

    //Métodos
    @Override
    public String emitirSonido() {
        return "Plas plas";
    }
    @Override
    public String toString() {
        return "Bateria{" +
                "noPlatillos=" + numPlatillos +
                ", marca='" + marca + '\'' +
                '}';
    }
    //Constructores
    public Bateria() {
    }
     public Bateria(String marca, int noPlatillos) {
        super(marca);
        this.numPlatillos = noPlatillos;
    }
    //Setters y Getters
    public int getNoPlatillos() {
        return numPlatillos;
    }
    public void setNoPlatillos(int noPlatillos) {
        this.numPlatillos = noPlatillos;
    }
}
