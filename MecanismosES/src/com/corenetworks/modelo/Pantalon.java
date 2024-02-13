package com.corenetworks.modelo;

public class Pantalon extends Ropa{
    //Atributos
    private String tipoPantalon;

    //Metodos

    @Override
    public String toString() {
        return "Pantalon{" +
                "tipoPantalon='" + tipoPantalon + '\'' +
                '}';
    }

    public void desmontar(String des){

    }
   //Constructor
    public Pantalon() {
    }

    public Pantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }
    //Setters y Getters

    public String getTipoPantalon() {
        return tipoPantalon;
    }

    public void setTipoPantalon(String tipoPantalon) {
        this.tipoPantalon = tipoPantalon;
    }
}
