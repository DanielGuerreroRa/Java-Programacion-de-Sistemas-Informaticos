package com.corenetworks.presetacion;

public class Ejercicio1Wh {
    //Ejercicio 1:
    //Calcular el factorial de 25
    public static void main(String[] args) {
        int numero = 25;
        long factorial = 1;

        while (numero > 0){
            factorial *= numero;
            numero--;
        }
        System.out.println("El factorial de 25 es: " + factorial);

    }
}
