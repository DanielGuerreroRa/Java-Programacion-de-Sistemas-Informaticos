package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaPaquete {

    public static void main(String[] args) {
        Paquete e2 = new Paquete();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la Ip Origen: ");
        e2.setIpOrigen(teclado.nextInt());
        System.out.println("Escribe la Ip Destino: ");
        e2.setIpDestino(teclado.nextInt());
        System.out.println("Escriba el mensaje: ");
        teclado.nextLine();
        e2.setMensaje(teclado.nextLine());
        String[] caracteres;
        if (e2.getMensaje().length() % 20 == 0) {

            caracteres = new String[e2.getMensaje().length() / 20];
        } else {
            caracteres = new String[e2.getMensaje().length() / 20 * 1];
        }
        for (int i = 0; i < caracteres.length; i++) {
            int posicionInicial = i * 20;
            System.out.println(posicionInicial);
            caracteres[i] = e2.getMensaje().substring(posicionInicial, posicionInicial + 20);
            System.out.println(caracteres[i]);
            if (e2.getMensaje().length() % 20 != 0 && i == caracteres.length - 1) {
                caracteres[i] = e2.getMensaje().substring(posicionInicial);
                e2.setContadorPaquetes(caracteres.length);
                System.out.println("El número total de paquetes es: " +e2.getContadorPaquetes());
            }
            String[] paquetes = new String[e2.getContadorPaquetes()];



            }
        }
    }

