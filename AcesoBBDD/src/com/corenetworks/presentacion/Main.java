package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProductos;
import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        }catch (ClassNotFoundException e){
            System.out.println(e.toString());
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println(e.toString());
            throw new RuntimeException(e);
        }
        AccesoProductos aP1 = new AccesoProductos();
//        try {
//            System.out.println(aP1.obtenerUno(1));
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println(aP1.obtenerTodos());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}