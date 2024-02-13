package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;
import com.corenetworks.modelo.ProductoPerecedero;

public class ProbarProducto {
    public static void main(String[] args) {
        ProductoPerecedero pp1 = new ProductoPerecedero("leche",2,1.2,"31/12/2023");
        System.out.println(pp1.toString());
        Producto p1 = new Producto("pan",1,0.8);
        Producto p2 = new Producto("cacao",1,5.35);
        System.out.println(p1.toString());
        System.out.println("Resultado del equeals: " + p1.equals(p2));//No son iguales p1 y p2 = false
    }
}
