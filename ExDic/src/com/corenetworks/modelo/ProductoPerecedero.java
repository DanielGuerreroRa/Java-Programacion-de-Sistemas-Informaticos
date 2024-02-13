package com.corenetworks.modelo;

public class ProductoPerecedero extends Producto {
    //Atributos
    protected String fechaCaducidad;
    //Metodos


    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    //Constructor
    public ProductoPerecedero() {
    }
    public ProductoPerecedero(String nombre, int cantidad, double pvp, String fechaCaducidad) {
        super(nombre, cantidad, pvp);
        this.fechaCaducidad = fechaCaducidad;
    }
    //Setters y Getters

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
