package com.corenetworks.modelo;

public class  Cuadrado extends Figura {
    public static void main(String[] args) {
    }
        //Atriubutos
    private double lado;

    //Métodos
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    //Constructores

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }
    //Setters y Getters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}

