package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarTaller {
    public static void main(String[] args) {
        Coche c1 = new Coche("2503FJK, ","Seat Leon");
        ITaller tMecanico = new TallerMecanica();
        SeguroCoche s1 =new SeguroCoche(tMecanico, "Mafre");
        System.out.println(s1.reparar(c1));
        ITaller tPintura = new TallerPintura();
        s1.setTaller(tPintura);
        System.out.println(s1.reparar(c1));
    }
}
