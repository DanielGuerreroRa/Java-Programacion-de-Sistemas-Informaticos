package com.corenetworks.presentacion;

import com.corenetworks.modelo.Mensaje;

import java.util.Scanner;

public class ProbarMensaje {
    public static void main(String[] args) {
        Mensaje c1 = new Mensaje();
        Scanner teclado = new Scanner(System.in);

        System.out.println("El saludo es -> ");
        c1.setSaludo(teclado.nextLine());
        System.out.println("El Origen es -> ");
        c1.setIpOrigen(teclado.nextLine());
        System.out.println("El destinatario es -> ");
        c1.setIpDestino(teclado.nextLine());

        System.out.println("Los datos son: " + c1.mostrarInfo());
        System.out.println("Saludo tiene " + c1.numeroDePalabras() + " palabras");
    }

}
