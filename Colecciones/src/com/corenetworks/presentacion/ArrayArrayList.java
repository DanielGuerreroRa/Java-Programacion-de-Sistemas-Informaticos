package com.corenetworks.presentacion;

import java.util.ArrayList;
import java.util.List;

public class ArrayArrayList {
    public static void main(String[] args) {
        int[] arrayNumeros = {1,2,3,4,5};

        for (int i = 0; i < arrayNumeros.length; i++){
            System.out.println(arrayNumeros[i]);
        }
        for (Object elemento: arrayNumeros){
            System.out.println(elemento);
        }

       List listaNum = new ArrayList();
       listaNum.add(6);
       listaNum.add(7);
       listaNum.add(8);
       listaNum.add(9);
       listaNum.add(10);

       for (int i = 0; i < listaNum.size(); i++){
           System.out.println(listaNum.get(i));
       }
       for (Object elemento: listaNum){
           System.out.println(elemento);
       }




    }
}
