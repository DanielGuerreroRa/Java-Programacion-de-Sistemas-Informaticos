package com.corenetworks.persistencia;

import com.corenetworks.modelo.Socio;

import java.sql.SQLException;
import java.sql.Statement;

public class AccesoSocio extends Conexion {
    public boolean alta(Socio s) throws SQLException, ClassNotFoundException {
        // Declarar variables
        Statement sentencia;
        int resultado = 0;
        String sql = "insert into socios (carnet, dni) values('" + s.getCarnet() + "','" +
                s.getDni() + "');";
        //Abrir la conexión
        abrirConexion();
        //Crear Statement
        sentencia = miConexion.createStatement();
        //Actualización
        resultado=sentencia.executeUpdate(sql);
        //Devolver el resultado
        return resultado >0;


    }
}
