package com.corenetworks.presetacion;

import java.util.Scanner;

public class Ejercicio9If {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el sueldo: ");
        double sueldo = teclado.nextDouble();
        System.out.print("Ingrese el género (M/F): ");
        char genero = teclado.next().charAt(0);
        System.out.print("Ingrese la cantidad de hijos: ");
        int cantidadDeHijos = teclado.nextInt();

        double aumentoSueldo = 0;
        double aumentoporHijo = 0;

        if (sueldo < 15000) {
            System.out.println("Tiene un aumento de 15%: " + sueldo * 0.15);
            aumentoSueldo = sueldo * 0.15;
        } else if (sueldo >= 15000) {
            System.out.println("Tiene un aumento del 12%: " + sueldo*0.12);
            aumentoSueldo = sueldo * 0.12;
        }

        if (genero == 'M') {
            System.out.println("Tiene un aumento del 2%: " + sueldo*0.02);
            aumentoSueldo += sueldo * 0.02;
        }

        aumentoporHijo = aumentoSueldo += sueldo * cantidadDeHijos * 0.01;
        System.out.println("Tiene un aumento del 1% por cada hijo: " + aumentoporHijo);

        double sueldoTotal = sueldo + aumentoSueldo + aumentoporHijo;

        System.out.println("El sueldo total después de los aumentos es: " + sueldoTotal);
    }
}