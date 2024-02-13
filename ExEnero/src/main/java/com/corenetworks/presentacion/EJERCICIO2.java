package com.corenetworks.presentacion;

import java.io.*;
import java.util.Scanner;

public class EJERCICIO2 {
    public static void main(String[] args) {
    BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));

    try {
    //Ingresar el archivo de entrada llamado origen.txt
    System.out.println("Ingresar el archivo de entrada: ");
    String archivoEntrada = b1.readLine();

    //Dar por consola valor entre 1 y 255
    System.out.println("Introduci un valor numérico entre 1 y 255: ");
    int usuario = Integer.parseInt(b1.readLine());

    if (usuario < 1|| usuario >255) {
    System.out.println("El valor debe estar entre 1 y 255.");
    return;
    }

    //Ingresar el archivo de salida llamado cifrado.txt
    System.out.println("Ingresar el archivo de salida: ");
    String archivoSalida = b1.readLine();


    try (FileWriter f1 = new FileWriter(archivoSalida);
    PrintWriter p1 = new PrintWriter(f1)) {

    int letra;
    while ((letra = b1.read()) != -1) {
    // Operación XOR ^
    int letraCifrada = letra ^ usuario;
    p1.write(letraCifrada);
    }

    }
    } catch (IOException e) {
         System.out.println(e.toString());
         }
    }
}
