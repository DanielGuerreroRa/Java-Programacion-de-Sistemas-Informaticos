package com.corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //Atributos
    protected Connection miConexion;
    //Métodos

    @Override
    public String toString() {
        return "Conexion{" +
                "miConexion=" + miConexion +
                '}';
    }

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/Northwind2",
                "postgres", "postgres");
        System.out.println("Exito al abrir la conexión");
    }
    //Constructores

    public Conexion() {
    }


    //Setters y Getters

}
