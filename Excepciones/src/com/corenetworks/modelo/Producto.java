package com.corenetworks.modelo;

public class Producto {
    //Atributos
    private int id;

    //Métodos


    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                '}';
    }
    public void comprobar() throws Exception {
        if (id ==0){

            throw new Exception("El id no puede ser 0");
        }

    }
    //Constructor
    public Producto() {
    }

    public Producto(int id) {
        this.id = id;
    }
    //Setters y Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
