package com.corenetworks.presetacion;

import jdk.jshell.spi.SPIResolutionException;

public class Ejercicio5sw {
    //Con una letra que contiene un número romano:
    //I, V, X, L, C, D, M (incluso minúsculas)
    //Decir a que numero corresponde
    public static void main(String[] args) {
        char letra = 'V';
        System.out.println("El valor del numero romano " + letra + " es:");

        switch (letra) {
            case 'I':
                System.out.println(1);
                break;
            case 'V':
                System.out.println(5);
                break;
            case 'X':
                System.out.println(10);
                break;
            case 'L':
                System.out.println(50);
                break;
            case 'C':
                System.out.println(100);
                break;
            case 'D':
                System.out.println(500);
                break;
            case 'M':
                System.out.println(100);
                break;


        }
    }
}