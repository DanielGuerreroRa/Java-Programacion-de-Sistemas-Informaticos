package com.corenetworks.presentacion;

public class ProbarClasesEnvolventes {
    public static void main(String[] args) {
        //Tipos primitivos -> Convertilos a objetos

        //BOXING

        int i = 5;
        Integer iEnvolvente = i;
        System.out.println("Máximo valor de Integer: " + Integer.MAX_VALUE);
        System.out.println("Máximo valor de Integer: "+ Integer.MIN_VALUE);
        String numero = "5";
        System.out.println(Integer.parseInt(numero));

        float sueldo = 1_500.50f;
        System.out.println("Máximo valor de Float: " + Float.MAX_VALUE);
        System.out.println("Máximo valor de Float: " +Float.MIN_VALUE);
        System.out.println(Float.parseFloat("1500.5"));

        char letra = 'a';
        Character lEnvolvente = letra;
        System.out.println("Caracter envolvente: " + lEnvolvente);
        System.out.println("Valor máximo del Character: " + Character.MAX_VALUE);
        System.out.println("Valor minimo del Character: " + Character.MIN_VALUE);
        System.out.println("Parse de Character: " );


        //UNBOXING
        int i2 = iEnvolvente;
        System.out.println("Clase envolvente convertido a primitivo: " + i2);
        char letra2 = lEnvolvente;
        System.out.println("Char envolvente convertido a primitivo char: " + letra2);
    }
}
