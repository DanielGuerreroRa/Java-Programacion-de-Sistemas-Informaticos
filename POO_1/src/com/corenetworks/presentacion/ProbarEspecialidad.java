package com.corenetworks.presentacion;

import com.corenetworks.modelo.Especialidad;

import java.util.Scanner;

public record ProbarEspecialidad() {
    public static void main(String[] args) {
        Especialidad e1 = new Especialidad(5353,"Pesos pesados");
        System.out.println(e1.toString());

        Especialidad e2 = new Especialidad();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el id: ");
        e2.setIdEspecialidad(teclado.nextInt());
        System.out.println("Escribe el nombre: ");
        e2.setNombre(teclado.nextLine());
        teclado.nextLine();
    }
}
