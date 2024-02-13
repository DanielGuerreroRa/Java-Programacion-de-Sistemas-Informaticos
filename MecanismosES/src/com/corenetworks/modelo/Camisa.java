package com.corenetworks.modelo;

public class Camisa extends Ropa{
    //Atributos
    private boolean corta;
    private double tallaCuello;
    //Métodos

    @Override
    public String toString() {
        return "Camisa{" +
                "corta=" + corta +
                ", tallaCuello=" + tallaCuello +
                '}';
    }
    public void desteñir (String d){

    }

    //Constructor

    public Camisa() {
    }

    public Camisa(boolean corta, double tallaCuello) {
        this.corta = corta;
        this.tallaCuello = tallaCuello;
    }
    //Setter y Getters

    public boolean isCorta() {
        return corta;
    }

    public void setCorta(boolean corta) {
        this.corta = corta;
    }

    public double getTallaCuello() {
        return tallaCuello;
    }

    public void setTallaCuello(double tallaCuello) {
        this.tallaCuello = tallaCuello;
    }
}
