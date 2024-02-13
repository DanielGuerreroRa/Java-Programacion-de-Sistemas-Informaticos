package com.corenetworks.presetacion;

import com.corenetworks.modelo.Bateria;
import com.corenetworks.modelo.Flauta;
import com.corenetworks.modelo.Guitarra;
import com.corenetworks.modelo.InstrumentoMusical;

public class PolimorfismoInstrumentos {
    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Yamaha","Nylon");
        InstrumentoMusical bataca = new Bateria("Sonic",5);
        InstrumentoMusical ham = new Flauta("Traveseras","madera");

        InstrumentoMusical[] instrumentoMusicals = {guido,bataca,ham};

        for (InstrumentoMusical elemento: instrumentoMusicals){
            System.out.println(elemento.toString());
            System.out.println("Como suena el instrumento: " + elemento.emitirSonido());


        }

    }
}
