package com.corenetworks.modelo;

public class Gerente extends Empleado  {
    //Atributos
    private double bono;
    //Métodos


    @Override
    public double calcularNomina() {
        return sueldo + bono;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    //Costructores
    public Gerente() {
    }

    public Gerente(double bono) {
        this.bono = bono;
    }

    public Gerente(String nombre, double sueldo, double bono) {
        super(nombre, sueldo);
        this.bono = bono;
    }
    //Setters y Getters


    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
}
