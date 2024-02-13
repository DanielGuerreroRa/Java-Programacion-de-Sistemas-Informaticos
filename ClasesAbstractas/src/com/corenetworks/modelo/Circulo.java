package com.corenetworks.modelo;

public class Circulo extends Figura {
    //Atributos
    private int radio;

    //Métodos

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }
    //Constructores
    public Circulo() {
    }
    public Circulo(int x, int y, int radio) {
        super(x, y);
        this.radio=radio;
    }
    //Setters y Getters

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
