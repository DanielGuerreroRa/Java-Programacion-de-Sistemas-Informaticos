package com.corenetworks.presentacion;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProbarFileOutputStream {
    public static void main(String[] args) {
        //Declarar variable
        FileOutputStream fSalida = null;
        DataOutputStream buffer = null;
        int contador = 5;

        //Acciones e/s
        try {
            fSalida = new FileOutputStream("Datos.dat");
            buffer = new DataOutputStream(fSalida);
            buffer.writeInt(contador);
            //Cerrar los flujos
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
