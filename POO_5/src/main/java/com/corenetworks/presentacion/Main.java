package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        //Numericos
        byte vByte = 127;
        short vShort = 1_200;
        int vInt = 1_000_000;
        long vLong = 1_000_000_000;

        float vFloat = 12.234F;
        double vDouble = 122323.45;

        char vChar = 'a';
        boolean vBoolean = true;

        //Clases envolventes
        Byte eByte = 17;
        Short eShort = 2_345;
        Integer eInteger = 3_000_000;
        Long eLong = 5_000_000_000L;

        Float eFloat = 1.34F;
        Double eDouble = 2345.34;

        Character eCharacter = 'e';
        Boolean eBoolean = false;

        //Convertir el valor 5 a Integer
        int variable = Integer.parseInt("5");

        //Convertir un String con valor 5.7 a double
        double variableString= Double.parseDouble("5.7");

        //Escribir en consola decimales
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribir un numero con decimales");
        //double numPorConsola = teclado.nextDouble();

        //Convertir un double en String
        System.out.println("Double convertido a String: " + eDouble.toString());
        Object o = new Object();
        System.out.println("Método to String de o: " + o.toString());

        //String
        String nombre = "Javier ";
        String apellido = "Espinosa García";
        System.out.println("Nombre completo: " + nombre + apellido);
        System.out.printf("Nombre completo: %s %s",nombre,apellido);

        //Definir edad y suelto
        int edad = 25;
        double sueldo = 1_500.50;
        System.out.printf("Su nombre es --> %s %s, tiene %d y gana %f",nombre,apellido,edad,sueldo);

        //Nombre en mayusculas
        System.out.println(nombre.toUpperCase());
        //Nombre minusculas
        System.out.println(nombre.toLowerCase());
        //Posicion de la primera a
        System.out.println(nombre.indexOf('a'));
        //Cambiar minuscula y poner mayuscula
        System.out.println(nombre.replace("a","A"));
        //Saber si contiene la letra
        System.out.println(nombre.contains("i")); //Devuelve true o false

        //Solicitar una aplabra por consola y dividirlo por palabras
        String frase = null;
        System.out.println("Escriba la frase: ");
        //frase = teclado.nextLine();

       // String[] palabra = frase.split(" ");
        //System.out.println(Arrays.toString(palabra));

        //Fechas
        LocalDate fCumpleaños = LocalDate.of(1993,4,29);
        System.out.println(fCumpleaños);
        //Cuantos años tiene
        System.out.println(Period.between(fCumpleaños,LocalDate.now()).getYears());
        //Sumar mes
        System.out.println(LocalDate.now().plusMonths(4));







    }
}