package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProbarPrintWriter {
    public static void main(String[] args) {
        //1.Definicion de variable

        try (FileWriter fSalida = new FileWriter("print_writer1.txt");){

            PrintWriter altoNivel = new PrintWriter(fSalida);
            altoNivel.println("Escrito desde un PrintWriter");
            altoNivel.format("El nombre del producto %20s tiene un precio %.2f y si hay %d unidades",
                    "Te chai", 1.333, 50);
            altoNivel.flush();
            altoNivel.close();
            fSalida.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }



    }
}
