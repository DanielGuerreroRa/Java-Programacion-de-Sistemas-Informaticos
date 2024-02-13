package com.corenetworks.modelo;

public class Superman implements IObjetoVolador{

    //Atributos


    //Métodos

    @Override
    public String toString() {
        return "Superman{}";
    }

    @Override
    public String despegar() {
        return "Superman despega";
    }

    @Override
    public String volar() {
        return "Superman vuela";
    }

    @Override
    public String aterrizar() {
        return "Superman aterriza";
    }
    public String detenerBalas() {
        return "Superman detiene las balas";
    }
    public String saltarEdificio(){
        return "Superman salta edificios";
    }
}
