package com.corenetworks.presentacion;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("archivo_ejemplo.txt");
        System.out.println("Nombre del archivo ->" + f1.getName());
        System.out.println("Ruta absoluta -> "+ f1.getAbsolutePath());
        System.out.println("Es una carpeta ?" + f1.isDirectory());
        System.out.println("Es un fichero ? "+ f1.isFile());
        System.out.println("Ultima modificación ->"+ f1.lastModified());
        System.out.println("Existe ? "+ f1.exists());


        //Crear una carpeta
        File f2 = new File("documentos");
        if(!f2.exists()){
            System.out.println(f2.mkdir());
        }
        System.out.println("Nombre de la carpeta ->" + f2.getName());
        System.out.println("Ruta absoluta -> " + f2.getAbsolutePath());
        System.out.println("Es un directorio ? " + f2.isDirectory());
        System.out.println("Es un fichero ? " + f2.isFile());
        System.out.println("Existe ? ->" + f2.exists());


    }
}