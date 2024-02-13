package com.corenetworks.presentacion;

import com.corenetworks.modelo.Cuenta;

public class ProbarCuenta {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Juan Carlos",1200.35);
        System.out.println("Datos bancarios: " + c1.toString());
        c1.ingreso(100);
        System.out.println("Ingreso " +c1.getCantidad());
        c1.retirar(50);
        System.out.println("Retirar cantidad " + c1.getCantidad());


    }
}
