package com.corenetworks.presentacion.robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorRobot {
    public static void main(String[] args) {
        String []respuestas ={"Desde las 10:00 hasta las 21:00","Dias festivos de Madrid","Si","30€"};
        BufferedReader mE = null;
        PrintWriter mS=null;
        try(ServerSocket sv= new ServerSocket(3000);){
            while (true){
                System.out.println("Esperando peticion...");
                Socket s1= sv.accept();
                mE=new BufferedReader(new InputStreamReader(s1.getInputStream()));
                String pregunta = mE.readLine();
                int indice = Integer.parseInt(pregunta);
                mS=new PrintWriter(s1.getOutputStream(),true);
                mS.println(respuestas[indice-1]);
                System.out.println(respuestas[indice-1]);
            }

        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
