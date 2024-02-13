package com.corenetworks.presentacion;

import com.corenetworks.modelo.Gerente;

public class PruebaGerente {
    public static void main(String[] args) {
        Gerente g1 =  new Gerente("Carlos",1200,"Mixto");
        Gerente g2 = new Gerente();
        System.out.println("Calculo: " + g1.calcularSueldo());

    }
}
