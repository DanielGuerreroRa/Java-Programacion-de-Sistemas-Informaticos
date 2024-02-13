package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbasList {
    public static void main(String[] args) {
        List lista = new ArrayList();
        System.out.println("Número de elementos: " + lista.size());
        System.out.println("Está vacia la lista: " + lista.isEmpty());
        lista.add("casa");
        lista.add("casa");
        System.out.println(lista);
        System.out.println("Contiene el String casa: " + lista.contains("casa"));
        lista.add(7);
        System.out.println("Obtener el elemento de la posicón 0: " + lista.get(0));
        lista.set(0, "piso"); //Elegimos la posicion y el nombre del elenemto
        System.out.println(lista); //Si hay alguno antiguo en esa posición lo machaca
        lista.set(0, "adosado");
        System.out.println(lista);
        System.out.println("Cual es la posición del elemento 7: " + lista.indexOf(7));
        lista.remove("adosado"); //Con remove eliminamos el elemento de la lista
        System.out.println(lista);
        Empleado e1 = new Empleado(6);
        lista.add(e1);
        System.out.println(lista);

        System.out.println("Recorrer con un bucle for each:");
        for (Object elemento : lista) {
            System.out.println(elemento.toString());
        }
        System.out.println("Recorrer con un bucle for:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));


        }
    }
}
