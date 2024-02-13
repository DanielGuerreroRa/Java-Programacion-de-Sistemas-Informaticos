package com.corenetworks.modelo;

public class Ordenador {
    private String numSerie;
    private String modelo;
    private boolean portatil;

    @Override
    public String toString() {
        return "Ordenador{" +
                "numSerie='" + numSerie + '\'' +
                ", modelo='" + modelo + '\'' +
                ", portatil=" + portatil +
                '}';

    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPortatil() {
        return portatil;
    }

    public void setPortatil(boolean portatil) {
        this.portatil = portatil;
    }

    public Ordenador() {
    }

    public Ordenador(String numSerie, String modelo, boolean portatil) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.portatil = portatil;
    }
}
