package com.corenetworks.presetacion;

import com.corenetworks.modelo.Cuadrado;
import com.corenetworks.modelo.Figura;
import com.corenetworks.modelo.Triangulo;

public class PoliforismoFugura {
    public static void main(String[] args) {
        Triangulo tPeque = new Triangulo();
        tPeque.setAltura(8);
        tPeque.setBase(2);
        Cuadrado cPeque = new Cuadrado();
        cPeque.setLado(4);

        Figura tMediano = new Triangulo(4,5,4,6);

        Figura[] figuras= {tPeque,cPeque, tMediano};

        for (Figura elemento: figuras){
            if (elemento instanceof Cuadrado) {
                System.out.println("Mostrar lado: " + ((Cuadrado) elemento).getLado());
            }
            if (elemento instanceof Triangulo){
                System.out.println("Mostrar base: " + ((Triangulo) elemento).getBase() + " y altura: " + ((Triangulo) elemento).getAltura());
            }
            System.out.println(elemento.toString());
            System.out.println("Calcular el area: " +elemento.calcularArea());
        }

    }
}
