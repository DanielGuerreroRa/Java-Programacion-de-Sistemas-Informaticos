package com.corenetworks.presetacion;

import com.corenetworks.modelo.*;

public class ProbarInstrumentoMusical {
    public static void main(String[] args) {
        Guitarra g1 = new Guitarra("Hero","Metalicas");
        System.out.println(g1.toString());
        System.out.println("La guitarra suena " + g1.emitirSonido());
        Bateria b1 = new Bateria("Hero", 5);
        System.out.println(b1.toString());
        System.out.println("La bateria suena " + b1.emitirSonido());
        Flauta f1 = new Flauta("Stilo","madera");
        System.out.println(f1.toString());
        System.out.println("La flauta suena " +f1.emitirSonido());


    }
}
