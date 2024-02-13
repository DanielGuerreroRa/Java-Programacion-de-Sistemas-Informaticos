package com.corenetworks.modelo;

public class Guitarra extends InstrumentoMusical{
    //Atributos
    private String tipoCuerdas;

    //Métodos
    @Override
    public String emitirSonido() {
        return "Ring ring";
    }
    @Override
    public String toString() {
        return "Guitarra{" +
                "tipoCuerdas='" + tipoCuerdas + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    //Constructores
    public Guitarra() {
    }
     public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }
    //Setters y Getters
    public String getTipoCuerdas() {
        return tipoCuerdas;
    }
    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
