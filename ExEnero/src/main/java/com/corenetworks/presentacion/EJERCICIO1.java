package com.corenetworks.presentacion;


import java.io.*;
import java.util.Scanner;

public class EJERCICIO1 {

    public static void main(String[] args) {
    String rArchivo;
    //Crear scanner para introducir el archivo en consola
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la ruta completa del archivo: ");
    //Ingresar el fichero con nombre fichero1.txt
    rArchivo= teclado.nextLine();

    //Crear archivo y utilizar laruta
    File file =new File(rArchivo);

    //Verifica si el archivo existe
    if (file.exists()) {

    //Muestra la información del archivo
    File f1 = new File("archivo_ejemplo.txt");
    System.out.println("Nombre del archivo: " + f1.getName());
    System.out.println("Ruta absoluta: "+ f1.getAbsolutePath());
    System.out.println("Existe? "+ f1.exists());
    System.out.println("Es una carpeta?" + f1.isDirectory());
    System.out.println("Es un fichero? "+ f1.isFile());

    } else {
    System.out.println("no existe el archivo");
      }
    }
    }
