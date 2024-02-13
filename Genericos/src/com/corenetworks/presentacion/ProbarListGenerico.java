package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ProbarListGenerico {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(8));
        empleados.add(new Empleado(9));
        empleados.add(new Empleado(15));
        Empleado e1 = new Empleado(7);
        empleados.add(e1);
        empleados.add(e1);

        System.out.println("Cuantos empleados tiene la lista: " + empleados.size());
        System.out.println("Arraylist: " + empleados);
        System.out.println("Existe el empleado e1 en la lista: " + empleados.contains(e1));
        System.out.println("Empleado que esta en la posicion 3: " + empleados.get(3));
        System.out.println("En que posicion esta el e1: " + empleados.indexOf(e1));
        System.out.println("Eliminar el empleado e1: " + empleados.remove(e1));
        System.out.println("Lista: " + empleados);


    }
}
