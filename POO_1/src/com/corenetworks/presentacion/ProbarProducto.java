package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto(1,"Tomates",215);
        System.out.println(p1.toString());
        p1.compraProducto(200);
        System.out.println("Compra de productos " + p1.getCantidadExistencia() );
        p1.ventaProducto(12);
        System.out.println("Venta de producto " + p1.getCantidadExistencia());
    }
}
