package com.corenetworks.presetacion;

public class Ejercicio3Wh {
    //Ejercicio 3:
    //Calcular los 25 primeros números primos, NO DEL 1 AL 25
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int contador = 0;
        boolean primo;
        while (contador < 25) {
            primo = true;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    primo = false;
                }
                j++;
            }
            if (primo == true) {
                contador++;
                System.out.println(contador + "Es primo el número " + i);
            }
            i++;
        }
    }
}
