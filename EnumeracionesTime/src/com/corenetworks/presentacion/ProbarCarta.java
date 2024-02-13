package com.corenetworks.presentacion;

import com.corenetworks.modelo.Baraja;
import com.corenetworks.modelo.Carta;
import com.corenetworks.modelo.Numeros;
import com.corenetworks.modelo.Palo;

public class ProbarCarta {
    public static void main(String[] args) {

        Carta c1 = new Carta(Palo.CORAZONES,Numeros.DOS);
        System.out.println("La carta1: " + c1.toString());
        Carta c2 = new Carta();
        c2.setNumero(Numeros.JOTA);
        c2.setPalo(Palo.PICAS);
        System.out.println("La carta2 tiene el número " + c2.getNumero() + " y de palo " + c2.getPalo());

        Baraja b1 = new Baraja();
        System.out.println(b1);

    }

}
