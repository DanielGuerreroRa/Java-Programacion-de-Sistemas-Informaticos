package com.corenetworks.presentacion;

import com.corenetworks.modelo.Prooveres;

public class ProbarProveedores {
    public static void main(String[] args) {
        Prooveres p1 = new Prooveres();
        p1.setIdProveedores(8);
        p1.setNombre("Ferreteria Canillejas");
        p1.setTelefono("91 677 65 27");
        p1.setCantidadEmpleados(125);
        System.out.println("Id: " + p1.getIdProveedores());
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Telefono: " + p1.getTelefono());
        System.out.println("Cantidad de Empleados: " + p1.getCantidadEmpleados());
    }

}
