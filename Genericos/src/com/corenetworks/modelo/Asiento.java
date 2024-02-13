package com.corenetworks.modelo;

import java.util.ArrayList;
import java.util.List;

public class Asiento extends Avion {

    //Atributos
    private clasePasaje clase;
    private int numero;
    private Ubicacion ubicacion;
    private Pasajero pasajero;

    //Métodos


    @Override
    public String toString() {
        return "Asiento{" +
                "clase='" + clase + '\'' +
                ", numero=" + numero +
                ", ubicacion='" + ubicacion + '\'' +
                ", pasajero='" + pasajero + '\'' +
                '}';
    }
    //Constructores
    public Asiento() {
     int numeroAsiento = 1;
      = new ArrayList<>();


      }









    public Asiento(clasePasaje clase, int numero, Ubicacion ubicacion, Pasajero pasajero) {
        this.clase = clase;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.pasajero = pasajero;
    }

    //Setters y Getters
    public clasePasaje getClase() {
        return clase;
    }

    public void setClase(clasePasaje clase) {
        this.clase = clase;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }
}




