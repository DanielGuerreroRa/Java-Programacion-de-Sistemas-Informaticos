package com.corenetworks.presetacion;

public class Ejercicio6If {
    //Comparar tres números y decir cuál es el mayor
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 57;
        int num3 = 23;

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número " + num1 + " es mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El número " + num2 + " es mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("El número " + num3 + " es mayor");

        }
    }
}
