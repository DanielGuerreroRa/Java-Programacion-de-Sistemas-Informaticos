package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Polimorfismo
        Map tabla = new HashMap();
        tabla.put("52352512L", "Juan Lopez");
        System.out.println(tabla);
        tabla.put("52352345K", "Lola Lopez");
        System.out.println(tabla);

        System.out.println("Obtener el nombre del DNI 52352512L: " + tabla.get("52352512L"));
        System.out.println("Obtener el nombre del DNI 52352345K: " + tabla.get("52352345K"));

        System.out.println("Los Nombres: " + tabla.values());
        System.out.println("Los DNI: " + tabla.keySet());
        System.out.println("Nombres y DNI: " + tabla.entrySet());

    }
}