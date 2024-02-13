package com.corenetworks.presetacion;

import java.util.Scanner;

public class Ejercicio8If {
    //Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo:
    //Es par y múltiplo de 3
    //Es impar y múltiplo de 3
    //No es múltiplo de 3 pero es par
    //No es ni par ni múltiplo de 3
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el número: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("Es par y multiplo de 3");
        } else if (numero % 1 == 0 && numero % 3 == 0) {
            System.out.println("Es impar y multiplo de 3");
        } else if (numero % 2 == 0 && numero % 1 == 0) {
            System.out.println("Es par y no es multiplo de 3");
        } else if (numero % 1 == 0 && numero % 1 == 0) {
            System.out.println("Es impar y no es multiplo de 3");
        }
    }
}
