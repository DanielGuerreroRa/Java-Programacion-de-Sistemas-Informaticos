package com.corenetworks.presetacion;

public class Ejercicio2Wh {
    //Ejercicio 2:
    //Calcular la potencia de 2 elevado a 8
    public static void main(String[] args) {
        int base = 2;
        int exp = 8;
        int resultado = 1;
        while (exp > 0){
            resultado *= base;
            exp -= 1;

            System.out.println(resultado);

        }

    }
}
