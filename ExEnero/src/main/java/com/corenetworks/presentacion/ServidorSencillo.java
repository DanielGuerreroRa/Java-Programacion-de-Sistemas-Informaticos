package com.corenetworks.presentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSencillo {
    public static void main(String[] args) {
        BufferedReader bf;
        PrintWriter sRespuesta;
        String respuesta;
        int cantidad=0;
        try (ServerSocket servidor = new ServerSocket(1200);){
            while (true){
                System.out.println("En espera de peticiones ...");
                Socket s1 = servidor.accept();
                bf = new BufferedReader(new InputStreamReader(s1.getInputStream()));
                respuesta = bf.readLine();
                System.out.println(respuesta);
                System.out.println(respuesta.substring(10).strip());
                cantidad = Integer.parseInt(respuesta.substring(10).strip());


                sRespuesta = new PrintWriter(s1.getOutputStream(),true);
                sRespuesta.printf("El total de su cuenta es %.2f€ %n",(cantidad));

            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}