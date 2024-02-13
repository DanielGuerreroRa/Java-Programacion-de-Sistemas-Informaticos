package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    //Atributos
    protected String nombre;
    protected int cantidad;
    protected double pvp;

    //Metodos
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return cantidad == producto.cantidad && Double.compare(pvp, producto.pvp) == 0 && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, cantidad, pvp);
    }
    //Constructor

    public Producto() {
    }

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }
    //Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }
}
