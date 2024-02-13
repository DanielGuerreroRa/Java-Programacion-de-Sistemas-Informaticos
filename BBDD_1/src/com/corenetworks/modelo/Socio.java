package com.corenetworks.modelo;

import java.util.Objects;

public class Socio {

    private String dni;

    private String carnet;


    //Metodos


    @Override
    public String toString() {
        return "Socio{" +
                "dni='" + dni + '\'' +
                ", carnet='" + carnet + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return Objects.equals(dni, socio.dni) && Objects.equals(carnet, socio.carnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, carnet);
    }

    public Socio() {
    }

    public Socio(String dni, String carnet) {
        this.dni = dni;
        this.carnet = carnet;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}
