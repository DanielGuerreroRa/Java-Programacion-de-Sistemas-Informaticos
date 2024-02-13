package com.corenetworks.presentacion;

import com.corenetworks.modelo.Proyeco;

import java.util.Scanner;

public class PruebaProyecto {
    public static void main(String[] args) {


        Proyeco p1 = new Proyeco(3, "Videoclub", 5, 10.50);
        System.out.println("El importe sin descuento: " + p1.calcularImporte());
        System.out.println("El importe con el descuento es: " + p1.calcularImporte(0.05));
        System.out.println(p1.toString());

        //Definir Scanner
        Scanner teclado = new Scanner(System.in);
        //Con variable
        double descuentoPresentacion;
        System.out.println("El porcentaje del descuento es: ");
        descuentoPresentacion = teclado.nextDouble();
        System.out.println("Importe con descuento: " + p1.calcularImporte(descuentoPresentacion));
        //Sin variable
        System.out.println("Escribe el descuento: ");
        System.out.println("Importe con descuento: " + p1.calcularImporte(teclado.nextDouble()));


    }
}
