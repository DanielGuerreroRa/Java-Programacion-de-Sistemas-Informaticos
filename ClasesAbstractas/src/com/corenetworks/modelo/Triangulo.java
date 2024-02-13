package com.corenetworks.modelo;

public class Triangulo extends Figura{
    //Atributos
    private double base;
    private double altura;

    //Métodos


    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    //Constructores

    public Triangulo() {
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    //Setters y Getters

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
