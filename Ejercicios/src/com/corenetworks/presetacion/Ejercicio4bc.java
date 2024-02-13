package com.corenetworks.presetacion;

public class Ejercicio4bc {
    //Ejercicio 4.
    //Escribir el factorial del número 15
    public static void main(String[] args) {
        int numero = 15;
        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }


        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

