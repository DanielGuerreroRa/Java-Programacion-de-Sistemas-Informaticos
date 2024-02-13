package com.corenetworks.modelo;

public class Empleado {
    //Atributos
    private int id;

    //Métodos
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                '}';
    }
    //Constructores
    public Empleado() {
    }

    public Empleado(int id) {
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
