package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ProbarScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto = null;
        System.out.println("Escribe la palabra");
        texto = teclado.nextLine();


            try {
                FileWriter salida = new FileWriter("texto.txt");
                salida.write(texto);
                salida.flush();
                salida.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }



    }
}
