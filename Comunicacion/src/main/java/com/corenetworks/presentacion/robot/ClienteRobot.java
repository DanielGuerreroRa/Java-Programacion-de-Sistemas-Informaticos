package com.corenetworks.presentacion.robot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteRobot {
    public static void main(String[] args) {
        String preguntasSelecionada = mostrarMenu();
        try (Socket cl = new Socket("localhost", 3000);) {
            PrintWriter mAE = new PrintWriter(cl.getOutputStream(),true);
            mAE.println(preguntasSelecionada);
            System.out.println("esperando respuesta del serveidor...");
            //Esperamos contestacion del servidor
            BufferedReader mR = new BufferedReader(new InputStreamReader(cl.getInputStream()));
            System.out.println(mR.readLine());
        } catch (UnknownHostException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }

    private static String mostrarMenu() {
        String[] preguntas = {"Horario de la tienda", "Que dias no abren?", "Tienen el libro Java desde cero?", "Precio del libro?"};
        int numPregunta = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s %n", "-".repeat(50));
        System.out.printf("%-20s %n", "MENU DE OPCIONES");
        System.out.printf("%s %n", "-".repeat(50));
        //Mosttrar preguntas del Array
        for (int i = 0; i<preguntas.length; i++) {
            System.out.printf("%d %s %n", i+1, preguntas[i]);
        }
while (true){
    System.out.println("opcion seleccionada ->");
    numPregunta=sc.nextInt();
    if (numPregunta>=1 && numPregunta<=preguntas.length){
        break;
    }
}
        return Integer.toString(numPregunta);
    }
}

