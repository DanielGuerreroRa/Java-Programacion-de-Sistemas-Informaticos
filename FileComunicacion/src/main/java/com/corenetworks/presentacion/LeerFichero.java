package com.corenetworks.presentacion;

import java.io.*;

public class LeerFichero {
    public static void main(String[] args) {

        try(FileReader f1 = new FileReader("salida1.txt");
            FileWriter f2 = new FileWriter("MAYUSCULA.txt")) {
            int letra = 0;
            String texto= "";
            while(true){
                letra = f1.read();
                texto += Character.toString((char) letra);
                System.out.print((char) letra);
                if(letra == -1){
                    break;
                }
            }
            System.out.println();
            System.out.println();
            System.out.println(texto.toUpperCase());
            f2.write(texto.toUpperCase());
            f2.flush();


        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
