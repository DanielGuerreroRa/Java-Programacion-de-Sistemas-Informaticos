package com.corenetworks.presentacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        //Declaración de variables
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un dato numerico: ");
        try {
            dato= teclado.nextInt();
        }catch (InputMismatchException i1){
            System.out.println("El dato que se pidió fue numerico ---");
        }finally {
            System.out.println("Entra al finally");
        }

    }
}
