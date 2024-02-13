package com.corenetworks.presentacion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProbarBufferdWriter {
    public static void main(String[] args) {


        //Declarar variables
        FileWriter fSalida = null;
        BufferedWriter buffer = null;

        //Acciones de E/S
        try {
            fSalida = new FileWriter("buffered_writer_ejemplo.txt");
            buffer = new BufferedWriter(fSalida);
            buffer.write("Usando BufferdedWriter ...");

            //Cerrar flujos
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }


    }
}
