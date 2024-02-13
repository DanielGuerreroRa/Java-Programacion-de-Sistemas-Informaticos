package com.corenetworks.modelo;

import java.util.Objects;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    //Métodos

    @Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", año=" + anio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return dia == fecha.dia && mes == fecha.mes && anio == fecha.anio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }
    //Constructor

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    //Setters y Getters

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (dia >=1 && dia <=31){
            this.dia = dia;
        }else  {
            throw new Exception("El dia no esta dentro del rando 1-31");
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes >= 1 && mes <=12){
            this.mes = mes;
        }else {
            throw new Exception("El mes no esta dentro del rango 1-12");
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
