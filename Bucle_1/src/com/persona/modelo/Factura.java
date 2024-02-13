package com.persona.modelo;

public class Factura {
    public int id;
    public double importe;
    public String direccion;
    public String cliente;

    public double calcularIva(){
        return importe*0.21;
    }
    public double calcularIva(double porcentaje){
       return importe*porcentaje;
    }

}

