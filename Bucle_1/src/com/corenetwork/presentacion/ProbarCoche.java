package com.corenetwork.presentacion;

import com.corenetwork.modelo.Coche;

import java.util.Scanner;

public class ProbarCoche {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Coche c1 = new Coche();
        c1.color="Amarillo";
        c1.electrico= false;
        c1.modelo="Auris";
        c1.tipoMotor="Gasolina";
        c1.numPuertas=5;
        c1.acelerar();
        c1.frenar();

        Coche c2 = new Coche();
        c2.tipoColor="Rojo";
        c2.electrico=true;
        c2.modelo="Renault X";
        c2.tipoMotor="Diesel";
        c2.numPuertas=3;
        c2.acelerar();
        c2.frenar();
    }
}