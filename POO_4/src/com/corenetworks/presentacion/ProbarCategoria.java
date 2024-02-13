package com.corenetworks.presentacion;

import com.corenetworks.modelo.Categoria;

import java.util.ArrayList;
import java.util.List;

public class ProbarCategoria {
    public static void main(String[] args) {
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria(1,"Bebidas", "Bebidas"));
        categorias.add(new Categoria(2,"Condimentos", "Condimentos"));
        categorias.add(new Categoria(1,"Carne", "Carne"));
        System.out.println(categorias);

    }
}
