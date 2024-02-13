package com.corenetworks.presentacion;

import com.corenetworks.modelo.Producto;
import com.corenetworks.modelo.TipoProducto;

public class Ejemplo2TryCatch {
    public static void main(String[] args) {

        try{
            TipoProducto leche = TipoProducto.valueOf("PRODUCTO_ALIMENTACION");
        }catch (Exception e1){
            System.out.println(e1.getMessage());
    }finally {
            System.out.println("Entra al finally");
        }

        }
    }

