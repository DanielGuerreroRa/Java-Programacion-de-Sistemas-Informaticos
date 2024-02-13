package com.corenetworks.modelo;

public class CalculadoraMonetaria {

    public static final double tasaCambio = 1.20;


    public static double convertirEurosADolares(double cantidadEuros) {

        return cantidadEuros*tasaCambio;
    }

}
