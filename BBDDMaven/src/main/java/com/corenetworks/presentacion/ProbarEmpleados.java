package com.corenetworks.presentacion;

import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class ProbarEmpleados {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
