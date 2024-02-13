package com.corenetworks.modelo;

//Crear la clase Persona con un método que calcule la edad de la persona en días y también en
       // segundos. Como entrada se le da un entero que es la Edad en años.
public class PersonaEj3 {
    //Atributos
    private int edad;

    //Métodos
    @Override
    public String toString() {
        return "Persona{" +
                "edadEnAnios=" + edad +
                '}';
    }
    public int calcularEdadEnDias() {
        // Se asume que un año tiene 365 días
        return edad * 365;
    }

    public long calcularEdadEnSegundos() {
        return edad * 365 * 24 * 60 * 60;
    }
    //Constructores

    public PersonaEj3() {
    }
    public PersonaEj3(int edadEnAnios) {
        this.edad = edadEnAnios;
    }
    //Setters y Getters


    public int getEdadEnAnios() {
        return edad;
    }

    public void setEdadEnAnios(int edadEnAnios) {
        this.edad = edadEnAnios;
    }
}
