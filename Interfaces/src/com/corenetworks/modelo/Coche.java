package com.corenetworks.modelo;

public class Coche implements ITaller {
    //Atributos
    private String matricula;
    private String modelo;

    //Métodos

    @Override
    public String reparar(Coche c) {
        return null;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';

    }
    //Constructores

    public Coche() {
    }

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
    //Setters y Getters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
