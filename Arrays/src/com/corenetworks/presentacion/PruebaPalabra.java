package com.corenetworks.presentacion;

import com.corenetworks.modelo.Palabras;

import java.util.Scanner;

public class PruebaPalabra {
    public static void main(String[] args) {
        //Definir variables
        Scanner teclado = new Scanner(System.in);
        String palabra;
        int elemento;

        //Pedir el numero de palabras - leer ene consola
        System.out.println("Cuantas palabras: ");
        elemento = teclado.nextInt();
        teclado.nextLine();
        Palabras p1 = new Palabras(elemento);

        //Elementos
        for (int i = 0; i < elemento; i++){
            System.out.println("Escriba la palabra: ");
            p1.actualizaElemeto(teclado.nextLine(), i);
        }
        for (String foreach: p1.getPalabras()){
            System.out.println(elemento);

        }
    }
}
