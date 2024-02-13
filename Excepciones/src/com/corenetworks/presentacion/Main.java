package com.corenetworks.presentacion;

public class Main {
    public static void main(String[] args) {
        int[] enteros = new int[5];
        try {
            enteros[6] = 6;
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Entra el catch del IndexOutOfBoundsException");

        }catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
            System.out.println(e1.getCause());
        }finally {
            System.out.println("Entro al finally ");
        }

        //error tipico de los bucles por recorrer
        /*for (int i = 0; i <= enteros.length;i++);
        enteros[i]=i*5;*/
        System.out.println("Despues de la estructura try ");



    }
}