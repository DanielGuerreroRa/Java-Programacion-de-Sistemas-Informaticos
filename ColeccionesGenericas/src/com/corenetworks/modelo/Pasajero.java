package com.corenetworks.modelo;

import java.util.Objects;

public class Pasajero {

    private String dni;
    private String nombre;

    @Override
    public String toString() {
        return "Pasajero{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajero pasajero = (Pasajero) o;
        return Objects.equals(dni, pasajero.dni) && Objects.equals(nombre, pasajero.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre);
    }

    public Pasajero() {
    }

    public Pasajero(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
