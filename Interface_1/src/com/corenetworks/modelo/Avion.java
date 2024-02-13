package com.corenetworks.modelo;

public class Avion implements IObjetoVolador {

    //Atributos
    private String color;


    //Métodos

    @Override
    public String toString() {
        return "Avion{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public String despegar() {
        return "El avión esta despegando";
    }

    @Override
    public String volar() {
        return "El avión esta volando";
    }

    @Override
    public String aterrizar() {
        return "El avión esta aterrizando";
    }
    //Constructores

    public Avion() {
    }

    public Avion(String color) {
        this.color = color;
    }
    //Setters y Getters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
