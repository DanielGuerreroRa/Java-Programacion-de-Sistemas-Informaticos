package com.corenetworks.modelo;

public class Carta {
    //Atributos
    private Palo palo;
    private Numeros numero;

    //Métodos

    @Override
    public String toString() {
        return "Carta{" +
                "palo=" + palo +
                ", numero=" + numero +
                '}';
    }
    //Constructores

    public Carta() {
    }

    public Carta(Palo palo, Numeros numero) {
        this.palo = palo;
        this.numero = numero;
    }
    //Setters y Getters

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    public Numeros getNumero() {
        return numero;
    }

    public void setNumero(Numeros numero) {
        this.numero = numero;
    }
}
