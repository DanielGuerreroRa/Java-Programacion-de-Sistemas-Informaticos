package com.corenetworks.presetacion;

public class Ejercicio7bc {
    //Ejercicio 7.
    //Hallar todas las tablas de multiplicar con for anidados

    public static void main(String[] args) {
        int numero = 10;
        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println(); // Salto de línea después de cada tabla
        }
    }
}
