package com.corenetworks.presentacion;

import com.corenetworks.modelo.Medicos;

import java.util.Scanner;

public class ProbarMedico {
    public static void main(String[] args) {
        Medicos m1 = new Medicos(12,"Alberto","Ruiz Sanz","757448");
        System.out.println(m1.toString());


        //Recibir los datos por consola
        Scanner teclado = new Scanner(System.in);
        Medicos m2 = new Medicos();
        System.out.println("Escriba el id : ");
        m2.setIdMedico(teclado.nextInt());
        System.out.println("Escriba el nombre : ");
        m2.setNombre(teclado.nextLine());
        teclado.nextLine();
        System.out.println("Escriba el apellido: ");
        m2.setApellidos(teclado.nextLine());
        System.out.println("Escriba el cmp: ");
        m2.setCmp(teclado.nextLine());



    }
}
