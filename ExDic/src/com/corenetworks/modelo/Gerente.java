package com.corenetworks.modelo;

public class Gerente extends Empleado {
    //Atributos
    private String departamento;

    public Gerente() {
    }

    //Metodos
    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                '}';
    }


    @Override
    public double calcularSueldo() {
        return super.calcularSueldo()+500;
    }

    public Gerente(String nombre, int sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
}
