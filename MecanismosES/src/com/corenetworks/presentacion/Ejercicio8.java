package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {


        //Declarar una variable de cada tipo primitivo y escrinitlo en un fichero primitivos.dat
        byte Vbyte = 42;
        short Vshort = 12345;
        int Vint = 987654321;
        long Vlong = 1234567890123456789L;
        float Vfloat = 3.14f;
        double Vdouble = 2.71;
        char Vchar = 'A';
        boolean Vboolean = true;
        DataOutputStream buffer = null;
        FileOutputStream fSalida = null;


        try {
            fSalida = new FileOutputStream("Primitivos.dat", false);
            buffer = new DataOutputStream(fSalida);

            // Escribir cada tipo primitivo en el archivo
            buffer.writeByte(Vbyte);
            buffer.writeShort(Vshort);
            buffer.writeInt(Vint);
            buffer.writeLong(Vlong);
            buffer.writeFloat(Vfloat);
            buffer.writeDouble(Vdouble);
            buffer.writeChar(Vchar);
            buffer.writeBoolean(Vboolean);

            buffer.flush();
            buffer.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
