package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProbarBufferedReader {
    public static void main(String[] args) {
        //Declarar variable
        FileReader fEndrada = null;
        BufferedReader buffer = null;
        String linea = null;
        int contadorLinea = 0;

        //Acciones  e/s
        try {
            fEndrada = new FileReader("buffered_writer_ejemplo.txt");
            buffer = new  BufferedReader(fEndrada);
            while (true){
                linea= buffer.readLine();
                if (linea==null){
                    break;
                }
                System.out.println(linea);
                contadorLinea++;
                System.out.println("El fichero contiene " + contadorLinea + " líneas.");
            }
            //Cierre de flujos
            buffer.close();
            fEndrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());

            //Añadir la logica para decir cuantas lineas se han leido
        }

    }
}
