package com.corenetworks.presetacion;

public class Ejercicio5bc {
    //Ejercicio 5.
    //Hallar 2 elevado a 8
    public static void main(String[] args) {
        int exp = 1;

        for (int i = 1; i <= 8; i++) {
            exp = exp *2;
            System.out.println("La iteraccion " + i + " -> " + exp);
        }


    }
}