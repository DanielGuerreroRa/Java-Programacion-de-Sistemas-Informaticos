package com.corenetworks.modelo;

import java.util.Arrays;
import java.util.List;

public class Avion {

    private List<Asiento> claseEjecutiva;
    private List<Asiento> claseTurista;


    //Métodos


    @Override
    public String toString() {
        return "Avion{" +
                "claseEjecutiva=" + claseEjecutiva +
                ", claseTurista=" + claseTurista +
                '}';
    }

    //Constructores
    public Avion() {
    }

    //Getters
    public List<Asiento> getClaseEjecutiva() {
        return claseEjecutiva;
    }


    public List<Asiento> getClaseTurista() {
        return claseTurista;
    }

    public void setClaseEjecutiva(List<Asiento> claseEjecutiva) {
        this.claseEjecutiva = claseEjecutiva;
    }

    public void setClaseTurista(List<Asiento> claseTurista) {
        this.claseTurista = claseTurista;
    }
}

