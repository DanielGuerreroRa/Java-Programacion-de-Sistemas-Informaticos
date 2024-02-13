package com.corenetworks.modelo;

import java.util.Objects;

public class Producto {
    //Atributos
    private final int idProducto;
    private double precio;

    //Métodos
    public final double iva(){
        return precio * 0.21;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return idProducto == producto.idProducto && Double.compare(precio, producto.precio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto, precio);
    }

    //Constructores

    public Producto(int idProducto, double precio) {
        this.idProducto = idProducto;
        this.precio = precio;
    }

    public Producto(int idProducto) {
        this.idProducto = idProducto;
    }
    //Setters y Getters


    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
