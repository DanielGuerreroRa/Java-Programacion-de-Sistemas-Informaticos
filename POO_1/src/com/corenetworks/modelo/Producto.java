package com.corenetworks.modelo;

public class Producto {
    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidadExistencia;

    //Metodos


    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", cantidadExistencia=" + cantidadExistencia +
                '}';
    }

    public void compraProducto(int cantidad) {
        if (cantidad >0) {
            cantidadExistencia=cantidadExistencia+cantidad;
        }
    }public void ventaProducto (int cantidad){
        if (cantidadExistencia>=cantidad){
            cantidadExistencia=cantidadExistencia-cantidad;
        }
    }
    //Contructores

    public Producto() {
    }

    public Producto(int idProducto, String nombre, int cantidadExistencia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidadExistencia = cantidadExistencia;
    }
    //Setters y Getters

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
