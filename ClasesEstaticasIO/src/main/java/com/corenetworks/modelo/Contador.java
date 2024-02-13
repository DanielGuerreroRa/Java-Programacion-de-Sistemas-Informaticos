package com.corenetworks.modelo;

public class Contador {
    //Atributos
    public static int contador;
    private int numeroSerie;

    public Contador(){
      // es igual   numeroSerie=++contador; al lo siguiente
        contador++;
        numeroSerie = contador;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Contador.contador = contador;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
