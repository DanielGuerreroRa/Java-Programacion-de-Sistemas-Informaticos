package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoFunciones;

import java.sql.SQLException;

public class ProbarFuncion {
    public static void main(String[] args) {
        AccesoFunciones af1 = new AccesoFunciones();
        try {
            System.out.println("Cantidad en existencia: " + af1.ProbarFunciones());
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
        }
    }
}
