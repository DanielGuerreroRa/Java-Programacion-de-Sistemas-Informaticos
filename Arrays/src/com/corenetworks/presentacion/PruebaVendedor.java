package com.corenetworks.presentacion;

import com.corenetworks.modelo.Vendedor;

import java.util.SortedMap;

public class PruebaVendedor {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(1,1_500,"83748465K","Ramiro",30000,0.01);
        System.out.println("Sueldo: " + v1.calcularSueldo());
        System.out.println(" Impuesto: " + v1.calcularImuesto());
        System.out.println(v1.toString());

    }
}
