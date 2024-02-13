package com.corenetworks.modelo;

public class Producto {
    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidadInexistente;
    //Setters
    public void setIdProducto(int valor){
        idProducto = valor;

    }
    public void setNombre(String nombre){

        this.nombre = nombre;
    }
    public void setCantidadInexistente(int cantidadInexistente){
        this.cantidadInexistente=cantidadInexistente;

    }
    //Getters
    public int getIdProducto(){
        return idProducto;
    }
    public String getNombre(){
        return nombre;
    }
    public int getCantidadInexistente(){
        return cantidadInexistente;
    }
}

