package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
        //Declarar variables
        String nombreFichero = "salida.txt";
        String nombreFichero2 = "entrada.txt";
        try {
            FileWriter fSalida = new FileWriter(nombreFichero);
            fSalida.write("Escribiendo desde java un fichero plano");
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileWriter fSalida = new FileWriter(nombreFichero2);
            fSalida.write("Escribiendo desde java un fichero plano");
            fSalida.flush();
            fSalida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
