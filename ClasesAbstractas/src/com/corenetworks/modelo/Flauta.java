package com.corenetworks.modelo;

public class Flauta extends InstrumentoMusical{
    //Atributos
    private String material;

    //Métodos
    @Override
    public String emitirSonido() {
        return "Tururu";
    }
    @Override
    public String toString() {
        return "Flauta{" +
                "material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    //Constructor
    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }
    //Setters y Getters
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
}
