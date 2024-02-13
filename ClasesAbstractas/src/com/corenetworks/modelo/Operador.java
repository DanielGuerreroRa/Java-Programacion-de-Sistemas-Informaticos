package com.corenetworks.modelo;

public class Operador extends Empleado{
    //Atributos
    private int piezas;
    private double incentivo;

    //Métodos


    @Override
    public String toString() {
        return "Operador{" +
                "piezas=" + piezas +
                ", incentivo=" + incentivo +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public double calcularNomina() {
        return sueldo + (piezas*incentivo);
    }
    //Constructores
    public Operador() {
    }

    public Operador(int piezas, double incentivo) {
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    public Operador(String nombre, double sueldo, int piezas, double incentivo) {
        super(nombre, sueldo);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }
    //Setters y Getters

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
