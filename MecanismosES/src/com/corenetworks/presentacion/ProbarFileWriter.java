package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;

public class ProbarFileWriter {
    public static void main(String[] args) {
            //1.Declarar variable
        FileWriter ficheroSalida = null;
        try {
            ficheroSalida = new FileWriter("primer_ejemplo.txt");
            //2.Acciones E/S
            ficheroSalida.write("Hola mundo desde java");

            //3.Cerrar los flujos
            ficheroSalida.flush();
            ficheroSalida.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
