package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad = 0, acumuladorEdades=0;
        String nombre = null;
        FileWriter fsalida;
        String frase = null;
        double nota=0, acumuladorNotas=0;
        String promedio = null;
        try {
            fsalida = new FileWriter("Diciembre27ejercicio2.txt");
            fsalida.write("Nombre \t \t \t Edad \t \t \t nota \n");
            fsalida.write("-".repeat(50)+ "\n");
            for (int i = 0; i < 5; i++) {
                System.out.println("Escriba el nombre");
                nombre = teclado.nextLine();
                System.out.println("Escriba su edad");
                edad = teclado.nextInt();
                teclado.nextLine();
                acumuladorEdades+=edad;
                System.out.println("Escriba la nota");
                nota= teclado.nextDouble();
                teclado.nextLine();
                acumuladorNotas+=nota;
                frase = String.format("%-20s \t \t \t %d \t \t \t %.2f \n", nombre, edad, nota);
                fsalida.write(frase);

            }

            fsalida.write(String.format("El promedio es %.2f",acumuladorNotas/5));
            fsalida.write(String.format("El promedio es %d",acumuladorEdades/5));
            fsalida.flush();
            fsalida.close();
            teclado.close();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }

}

