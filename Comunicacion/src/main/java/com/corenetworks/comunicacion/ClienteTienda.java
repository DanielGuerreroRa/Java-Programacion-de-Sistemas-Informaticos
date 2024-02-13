package com.corenetworks.comunicacion;

import com.corenetworks.modelo.TiendaC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Solicitar los datos de las tiendas
        TiendaC t1 = solicitarDatosVenta();
        try {
            // 2. Crear la conexion con el servidor
            Socket peticion = new Socket("localhost", 3000);
            // 3. Escribir en el outputStream
            PrintWriter sSalida = new PrintWriter(peticion.getOutputStream(),true);
            sSalida.println(t1.toString());
            // sSalida.flush();
            // 4. Leer que ha llegado las ventas
            BufferedReader bf = new BufferedReader(new InputStreamReader(peticion.getInputStream()));
            System.out.println(bf.readLine());
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }


    }

    private static TiendaC solicitarDatosVenta() {
        Scanner s1 = new Scanner(System.in);
        TiendaC t1 = new TiendaC();
        System.out.print("Escriba el numero de la tienda ->");
        t1.setId(s1.nextInt());
        s1.nextLine();
        System.out.print("Escriba el nombre de la tienda ->");
        t1.setNombre(s1.nextLine());
        System.out.print("Escriba las ventas de la tienda ->");
        t1.setVentas(s1.nextDouble());
        return t1;

    }

}
