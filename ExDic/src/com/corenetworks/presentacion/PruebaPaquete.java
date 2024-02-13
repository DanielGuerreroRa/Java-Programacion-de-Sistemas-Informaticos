package com.corenetworks.presentacion;

import com.corenetworks.modelo.Paquete;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaPaquete {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la Ip Origen: ");
        int ipOrigen = teclado.nextInt();
        System.out.println("Escribe la Ip Destino: ");
        int ipDestino = teclado.nextInt();
        System.out.println("Escriba el mensaje: ");
        teclado.nextLine();
        String mensaje = teclado.nextLine();
        int contadorPaquetes;
        if (mensaje.length() % 20 == 0) {

            contadorPaquetes = mensaje.length() / 20;
        } else {
            contadorPaquetes = mensaje.length() / 20;
            contadorPaquetes = contadorPaquetes + 1;
        }
        ArrayList<Paquete> paquetes = new ArrayList<Paquete>();
        for (int i = 0; i < contadorPaquetes; i++) {
            Paquete e2 = new Paquete();
            e2.setIpOrigen(ipOrigen);
            e2.setIpDestino(ipDestino);
            e2.setContadorPaquetes(contadorPaquetes);
            int posicionInicial = i * 20;
            String mens2;
            if (mensaje.length() % 20 != 0 && i == contadorPaquetes - 1) {
                mens2 = mensaje.substring(posicionInicial);
            }else{
                mens2 = mensaje.substring(posicionInicial, posicionInicial + 20);
            }
            e2.setMensaje(mens2);
            System.out.println(posicionInicial);
            System.out.println(e2.getIpOrigen());
            System.out.println(e2.getIpDestino());
            System.out.println(e2.getMensaje());
            System.out.println(e2.getContadorPaquetes());
            paquetes.add(e2);
            }
        }
    }

