package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.util.Scanner;

public class EstructurasControl {
    public static void main(String[] args) {
        //if
        //Si la cantidad es mayor a 100 el descuento es 3% y si es menor un 1%
        int cantidad = 140;
        if (cantidad > 100) {
            System.out.println("Descuento del 3% ");
        } else {
            System.out.println("Descuento del 1% ");
        }
        //Declarar la fecha pedido del 3 de Enero del 2024
        LocalDate fechaPedido = LocalDate.of(2024, 1, 3);

        //Declarar si la fecha pedido es antes del dia de hoy
        if (fechaPedido.isBefore(LocalDate.now())) {
            System.out.println("Es una fecha anterior");
        } else {
            System.out.println("Es una fecha posterior");
        }

        //La letra E es ejecución y la W esperando, la F terminado
        String estadoProceso = "E";
        switch (estadoProceso) {
            case "E":
                System.out.println("Ejecutando");
                break;
            case "W":
                System.out.println("Esperando");
                break;
            case "F":
                System.out.println("Terminado");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
        //Mostrar por consola desdendentemente del 1 al 10
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        //Sumar los numero que acepten por consola y parar cuando el usuario escriba cero
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero = 1;
        while (numero != 0) {
            System.out.println("Ingrese un número (0 para salir): ");
            numero = teclado.nextInt();
            suma += numero;

        }
        System.out.println("La suma de los números ingresados es: " + suma);

        //Otra opcion sujerida en certificacion java
        while (true) {

            System.out.println("Ingrese un número (0 para salir): ");
            numero = teclado.nextInt();
            suma += numero;
            if (numero == 0) {
                break;
            }
        }
        System.out.println("La suma de los números ingresados es: " + suma);

        //Decir si existe un numero en el array y recibirlo por consola
        //Hacerlo con el for each
        int[] numeros = {3,2,5,8,10};
        //Decir si existe un número en el array y recibirlo por la consola
        //Hacerlo con el foreach
        System.out.println("Elige tu numero");
        int numeroB= teclado.nextInt();
        for (int elemento:numeros){
            if (numeroB==elemento){
                System.out.println("si se ha encontrado");
                break;}
        }

    }
    }


