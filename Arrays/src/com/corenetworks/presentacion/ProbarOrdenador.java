package com.corenetworks.presentacion;

import com.corenetworks.modelo.Ordenador;

public class ProbarOrdenador {
    public static void main(String[] args) {
        //Array de ordenadores
        String [] nombres = new String[4];
        for (int i = 0; i < nombres.length; i++){
            nombres[i]="Juan";
        }
        Ordenador[] ordenadores = new Ordenador[4];
        for (int i = 0; i < ordenadores.length; i++){
            ordenadores[i]=new Ordenador("123","Gamer",true);
        }
        for (Ordenador elemento: ordenadores){
            System.out.println(elemento);
        }

    }
}
