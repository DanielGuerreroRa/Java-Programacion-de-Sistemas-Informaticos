package com.corenetworks.presentacion;

import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        try (Socket cl = new Socket("localhost", 3001);) {
            PrintWriter sSalida = new PrintWriter(cl.getOutputStream(), true);
            sSalida.println("Hola mundo");
            try (BufferedReader bf = new BufferedReader(new InputStreamReader(cl.getInputStream()));) {
                System.out.println(bf.readLine());
            }


        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}

