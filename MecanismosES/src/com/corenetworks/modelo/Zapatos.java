package com.corenetworks.modelo;

public class Zapatos extends Ropa{
    //Atributos
    private int tamanioTacon;

    //Métodos

    @Override
    public String toString() {
        return "Zapatos{" +
                "tamanioTacon=" + tamanioTacon +
                '}';
    }
    public void cambiarTacon(String t){

    }

    //Constructor

    public Zapatos() {
    }

    public Zapatos(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }
    //Setter y Getters

    public int getTamanioTacon() {
        return tamanioTacon;
    }

    public void setTamanioTacon(int tamanioTacon) {
        this.tamanioTacon = tamanioTacon;
    }
}
