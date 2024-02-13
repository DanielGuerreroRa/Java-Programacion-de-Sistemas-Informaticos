package com.corenetworks.presentacion;

import com.corenetworks.modelo.Empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ProbarEmpleado {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1,1500.69,"Juan"));
        empleados.add(new Empleado(2,1250,"Hector"));
        empleados.add(new Empleado(3,1800,"Cristina"));
        empleados.add(new Empleado(4,2200.05,"Laura"));
        System.out.println(empleados);

        TreeSet<Empleado> empleadosOrdenados = new TreeSet<>();
        empleadosOrdenados.add(new Empleado(1,1500.69,"Juan"));
        empleadosOrdenados.add(new Empleado(2,1250,"Hector"));
        empleadosOrdenados.add(new Empleado(3,1800,"Cristina"));
        empleadosOrdenados.add(new Empleado(4,2200.05,"Laura"));
        System.out.println(empleadosOrdenados);

    }
}
