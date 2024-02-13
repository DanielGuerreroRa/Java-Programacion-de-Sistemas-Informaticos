package com.corenetworks.presentacion;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProbarDataReaderStream {
    public static void main(String[] args) {
        //1.Definicion de variables
        FileInputStream fEntrada;
        DataInputStream dato;

        //2.Acciones de e/s
        try {
            fEntrada = new FileInputStream("primitivos.dat");
            dato = new DataInputStream(fEntrada);
            System.out.print("byte : " + dato.readByte());
            System.out.println("entero: " + dato.readInt());
            System.out.println("short: " + dato.readShort());
            System.out.println("long: " + dato.readLong());
            System.out.println("float: " + dato.readFloat());
            System.out.println("double: " + dato.readDouble());
            System.out.println("char: " + dato.readChar());
            System.out.println("boolean: " + dato.readBoolean());
            //3.Correr flujos
            dato.close();
            fEntrada.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }


    }
}
