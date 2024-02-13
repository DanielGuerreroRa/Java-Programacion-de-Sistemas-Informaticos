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
        System.out.println("Cuantos elementos tiene la lista -> " + empleados.size());
        System.out.println("Array List -> " + empleados);
        System.out.println("Existe el empleado e1 en la lista -> " + empleados.contains(e1));
        System.out.println("Empleado de la posición 3 -> "  + empleados.get(3));
        System.out.println("En que posicion está el e1 -> " + empleados.indexOf(e1));
        System.out.println("Eliminar el e1 -> " + empleados.remove(e1));
        System.out.println("Lista -> " + empleados);
    }
}
