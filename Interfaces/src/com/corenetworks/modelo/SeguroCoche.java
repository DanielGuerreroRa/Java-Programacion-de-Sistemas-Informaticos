package com.corenetworks.modelo;

public class SeguroCoche {
    //Atributos
    private ITaller taller; //Acomplaiento
    private String aseguradora;

    //Métodos

    public String reparar(Coche c) {
        return taller.reparar(c);
    }

    @Override
    public String toString() {
        return "SeguroCoche{" +
                "taller=" + taller +
                ", aseguradora='" + aseguradora + '\'' +
                '}';
    }
    //Costructores
    public SeguroCoche() {
    }

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }
    //Setters y Getters
    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}

