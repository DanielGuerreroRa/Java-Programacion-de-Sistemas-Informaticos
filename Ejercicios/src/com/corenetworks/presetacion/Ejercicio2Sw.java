package com.corenetworks.presetacion;

import java.util.Scanner;

public class Ejercicio2Sw {
    //Con una nota calificarlo de suspenso, aprobado, ...etc.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la nota del estudiante: ");
        int nota = teclado.nextInt();

        // Calificar la nota


        // Mostrar la calificación
        System.out.println("Calificación: " + nota);
        switch (nota){
            case 1,2,3,4:
                System.out.println("Insuficiente");
                break;
            case 5,6:
                System.out.println("Aprobado");
                break;
            case 7,8:
                System.out.println("Notable");
                break;
            case 9,10:
                System.out.println("Sobresaliente");
                break;
        }

    }
}
