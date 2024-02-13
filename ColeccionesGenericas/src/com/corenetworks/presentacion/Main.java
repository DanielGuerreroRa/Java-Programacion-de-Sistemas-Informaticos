package com.corenetworks.presentacion;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(9);
        numeros.add(8);
        numeros.add(7);
        numeros.add(2);

        System.out.println(numeros);

        System.out.println("Esta vacía ?" + numeros.isEmpty());
        System.out.println("Existe un 8 ? " + numeros.contains(8));
        System.out.println("Eliminamos el 2 " + numeros.remove(100));
        System.out.println("Conjunto -> " + numeros);

        //Recorrerla
        for (Integer elmento:
             numeros) {
            System.out.println(elmento.toString());
        }
    }
}