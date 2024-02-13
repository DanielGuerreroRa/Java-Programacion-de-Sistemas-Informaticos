package com.corenetworks.presentacion;

import java.util.Scanner;

public class ProbarArrays {
    public static void main(String[] args) {
        //Definir un array de 5 letras - char.
        char[] letras= new char[5];
        letras[0]='a';
        letras[1]='e';
        letras[2]='i';
        letras[3]='o';
        letras[4]='u';

        for (int i = 0; i < letras.length; i++){
            System.out.println("Elemento " + i + " -> " + letras[i]);
        }
        for (char elemento:letras){
            System.out.println(elemento);
        }
        //Definir un array de String de 3 elementos
        //Pedir por consola los 3 elementos del array
        Scanner teclado = new Scanner(System.in);
        String[] palabras={"","",""};
        // Equivalente valido: String[] palabras = new String[3];
        //Si no sabemos el numero de elementos seria: String[] palabras;
        System.out.println("Ingrese la primera palabra: ");
        palabras[0]=teclado.nextLine();
        System.out.println("Ingrese el seguda palabra: ");
        palabras[1]=teclado.nextLine();
        System.out.println("Ingrese el tercera palabra: ");
        palabras[2]=teclado.nextLine();

        //Estructura
        for (int i = 0; i< palabras.length; i++){
            System.out.println("Escriba la palabra: ");
            palabras[i]=teclado.nextLine();
        }
        //Comprobacion
        for (String elemento:palabras){
            System.out.println(elemento);

        }



        }
    }

