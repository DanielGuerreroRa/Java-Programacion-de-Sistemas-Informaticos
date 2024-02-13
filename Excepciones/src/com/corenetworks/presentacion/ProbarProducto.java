package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

public class ProbarProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto(0);
        Producto p2 = new Producto(5);
        try {
            p1.comprobar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            p2.comprobar();
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }

    }
    }

