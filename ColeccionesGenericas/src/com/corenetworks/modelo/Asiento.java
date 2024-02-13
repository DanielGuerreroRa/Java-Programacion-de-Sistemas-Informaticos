package com.corenetworks.modelo;

import java.util.Objects;

public class Asiento {

    private ClasePasaje clase;
    private int numero;
    private Ubicacion ubicacion;
    private Pasajero pasajero;

    @Override
    public String toString() {
        return "Asiento{" +
                "clase=" + clase +
                ", numero=" + numero +
                ", ubicacion=" + ubicacion +
                ", pasajero=" + pasajero +
                '}'+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asiento asiento = (Asiento) o;
        return numero == asiento.numero && clase == asiento.clase && ubicacion == asiento.ubicacion && Objects.equals(pasajero, asiento.pasajero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clase, numero, ubicacion, pasajero);
    }

    public Asiento() {
    }

    public Asiento(ClasePasaje clase, int numero, Ubicacion ubicacion, Pasajero pasajero) {
        this.clase = clase;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.pasajero = pasajero;
    }

    public ClasePasaje getClase() {
        return clase;
    }

    public Asiento(ClasePasaje clase, int numero, Ubicacion ubicacion) {
        this.clase = clase;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public void setClase(ClasePasaje clase) {
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
