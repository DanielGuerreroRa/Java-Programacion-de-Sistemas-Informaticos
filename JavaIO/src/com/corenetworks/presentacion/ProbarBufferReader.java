package com.corenetworks.presentacion;

import java.io.*;

public class ProbarBufferReader {
    public static void main(String[] args) {
        try {
            //Declaración fichero y buffer de entrada
            FileReader fEntrada = new FileReader("entrada.txt");
            BufferedReader bEntrada = new BufferedReader(fEntrada);
            //Declaración fichero y buffer de salida
            FileWriter fSalida = new FileWriter("salida.txt");
            BufferedWriter bSalida = new BufferedWriter(fSalida);
            String linea=null;
            while(true){
                linea = bEntrada.readLine();
                System.out.println("Se ha leido -> " + linea);
                if (linea==null){
                    break;
                }
                bSalida.write(linea+"\n");
            }
            bSalida.flush();
            bSalida.close();
            fSalida.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
