package com.corenetworks.modelo;

public class Alumno {
    //Atributos:
    private String nombreAlumo;
    private double[] notas;

    //Metodos:
    public String mostrar(){
        //Declarar variables
        String resultado= "";
        //Estructuras
        for (int i = 0; i< notas.length;i++){
            resultado=resultado+notas[i];

        }return resultado;
    }
    //Constructor
    public String alumno(String nombre, int numParciales) {
        this.nombreAlumo = nombre;
        notas = new double[numParciales];
        return nombreAlumo;
    }

    public void asignarValores(double nota, int posicion){
        notas[posicion]=nota;

        }

    public String getNombreAlumo() {
        return nombreAlumo;
    }

    public void setNombreAlumo(String nombreAlumo) {
        this.nombreAlumo = nombreAlumo;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double promedio() {
        //Declaracion de variables
        double suma = 0;
        //Estructuras
        for (int i =0; i < notas.length; i++){
            suma=suma+notas[i];
        }
        return suma/ notas.length;

        //Setter y Getters



    }
}



