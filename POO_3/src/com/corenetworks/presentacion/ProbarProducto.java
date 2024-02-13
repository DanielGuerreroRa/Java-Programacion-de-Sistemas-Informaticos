package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ProbarProducto  {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1,100,2));
        productos.add(new Producto(2,20,5));
        productos.add(new Producto(3,50,4));
        System.out.println(productos);

        TreeSet<Producto> productosOrdenados = new TreeSet<>();
        productosOrdenados.add(new Producto(1,100,2));
        productosOrdenados.add(new Producto(2,20,5));
        productosOrdenados.add(new Producto(3,50,4));
        System.out.println(productosOrdenados);



    }
}
