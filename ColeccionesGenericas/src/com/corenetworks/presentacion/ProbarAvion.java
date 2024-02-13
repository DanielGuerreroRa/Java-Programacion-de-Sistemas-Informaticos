package com.corenetworks.presentacion;

import com.corenetworks.modelo.Avion;
import com.corenetworks.modelo.Pasajero;
import com.corenetworks.modelo.Ubicacion;

import java.util.Scanner;

public class ProbarAvion {

    public static void main(String[] args) {
        Avion a1 = new Avion();


        //1. Declarar un Scanner
        //2. Pedir nombre, dni, ubicacion, clase
        //3. Instanciar un pasajero
        //4. if -> ejecutiva -> asignarAsientoEjecutivo sino asignarAsientoTurista
        //5. Tenemos que decir que asiento le corresponde

        Scanner teclado = new Scanner(System.in);
        Pasajero p1 = new Pasajero();
        int resultado=0;
        System.out.println("Escriba el nombre del pasajero ->");
        p1.setNombre(teclado.nextLine());
        System.out.println("Escriba el DNI del pasajero ->");
        p1.setDni(teclado.nextLine());
        System.out.println("Escoga la clase \n 1) Ejecutivo \n 2) Turista \n");
        int clase = teclado.nextInt();
        if (clase==1){
            System.out.println("Escoja la ubicacion \n 1) Ventana \n 2) Pasillo\n");
            int ubicacion = teclado.nextInt();
            if (ubicacion==1){
                resultado = a1.asignarAsientoEjecutivo(p1, Ubicacion.VENTANA);
            }else {
                resultado = a1.asignarAsientoEjecutivo(p1,Ubicacion.PASILLO);
            }


        }else{
            System.out.println("Escoja la ubicacion \n 1) Ventana \n 2)Centro \n  3) Pasillo\n");
            int ubicacion = teclado.nextInt();
            switch (ubicacion){
                case 1: resultado = a1.asignarAsientoTurista(p1,Ubicacion.VENTANA);
                    break;
                case 2: resultado = a1.asignarAsientoTurista(p1,Ubicacion.CENTRO);
                    break;
                case 3: resultado = a1.asignarAsientoTurista(p1,Ubicacion.PASILLO);
                    break;

            }
        }
        System.out.println("El asiento que le asignamos es el -> " + resultado);

    }
}