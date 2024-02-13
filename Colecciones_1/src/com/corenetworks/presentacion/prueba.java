package com.corenetworks.presentacion;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        //Probar la interface Set
        HashSet conjunto = new HashSet(); //Sin usar polimorfismo
        Set conjunto1 = new HashSet(); //Recomendable utilizar polimormismo
        System.out.println("Esta vacio: " + conjunto1.isEmpty());

        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1.add("casa"));
        System.out.println(conjunto1);
        conjunto1.add("jardin");
        System.out.println("La collección contiene el elemento casa? " + conjunto1.contains("casa"));
        System.out.println("numero de elementos: " + conjunto1.size());
        conjunto1.add("mesa");
        conjunto1.add("silla");
        System.out.println(conjunto1);

    }
}
