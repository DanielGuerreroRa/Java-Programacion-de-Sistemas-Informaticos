package com.corenetworks.modelo;

import java.util.Arrays;

public class Baraja {
    //Atributos
    Carta[] baraja;


    //Métodos

    @Override
    public String toString() {
        return "Barraja{" +
                "baraja=" + Arrays.toString(baraja) +
                '}';
    }
    //Constructor

    public Baraja() {
        baraja = new Carta[52];
        int indice = 0;
        for (Palo elemento : Palo.values()) {
            for (Numeros elemento2: Numeros.values()){
                baraja[indice]=new Carta(elemento, elemento2);
                indice++;
            }


                }
            }
        }






