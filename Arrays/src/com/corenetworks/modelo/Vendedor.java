package com.corenetworks.modelo;

public class Vendedor {
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private String dni;
    private String nombre;
    private double ventas;
    private double porcentajeComision;

    //Metodos
    public double calcularSueldo() {
        return sueldo + (ventas * porcentajeComision);
    }
    public double calcularImuesto() {
        return 0.3 * calcularSueldo();
    }
    @Override
    public String toString() {
        return "Vendedor{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", ventas=" + ventas +
                ", porcentajeComision=" + porcentajeComision +
                '}';
    }
    //Constructor
    public Vendedor() {
    }

    public Vendedor(int idEmpleado, double sueldo, String dni, String nombre, double ventas, double porcentajeComision) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
        this.dni = dni;
        this.nombre = nombre;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    //Setters y Getters

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(double porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }
}
