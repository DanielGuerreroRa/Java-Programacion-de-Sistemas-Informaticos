package com.corenetworks.modelo;

public class Vendedor extends Empleado{
    //Atributos
    private double ventas;
    private double comision;

    //Métodos

    @Override
    public double calcularNomina() {
        return sueldo + (ventas * comision);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ventas=" + ventas +
                ", comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    //Constructores
    public Vendedor() {
    }

    public Vendedor(double ventas, double comision) {
        this.ventas = ventas;
        this.comision = comision;
    }

    public Vendedor(String nombre, double sueldo, double ventas, double comision) {
        super(nombre, sueldo);
        this.ventas = ventas;
        this.comision = comision;
    }
    //Setters y Getters

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
