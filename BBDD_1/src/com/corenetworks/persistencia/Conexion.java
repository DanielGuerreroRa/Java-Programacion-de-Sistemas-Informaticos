package com.corenetworks.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //1. Atributos
    protected Connection miConexion;
    //2. Métodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/nautico",
                "postgres", "2Secure");
        System.out.println("Éxito al abrir la conexión");
    }
    //3. Constructors

    public Conexion() {
    }
    //4. Setters y getters

    }


//4. Setters y getters
