package com.corenetworks.modelo;

public class Empleado {
    //Atributos

    protected String nombre;
    protected int sueldo;

    //Metodos
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo='" + sueldo + '\'' +
                '}';
    }
    public double calcularSueldo(){
        return sueldo+.8;
    }

    //Constructor

    public Empleado() {
    }

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
