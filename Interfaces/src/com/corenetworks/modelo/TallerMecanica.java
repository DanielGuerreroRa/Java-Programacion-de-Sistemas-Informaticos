package com.corenetworks.modelo;

public class TallerMecanica implements ITaller {

//Atributos

//Métodos

    @Override
    public String reparar(Coche c) {
        return "El coche está en el taller mecanico " + c.getMatricula() + " modelo " + c.getModelo();
    }

    @Override
    public String toString() {
        return "TallerMecanica{}";
    }
}

