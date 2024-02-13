package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroBásico {
    public static void main(String[] args) {
        try(FileReader f1 = new FileReader("salida1.txt");) {
            int letra = 0;

            while(true){
                letra = f1.read();
                System.out.print((char) letra);
                if(letra == -1){
                    break;
                }


            }


        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
