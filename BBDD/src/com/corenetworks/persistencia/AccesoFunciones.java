package com.corenetworks.persistencia;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoFunciones extends Conexion{
    public int ProbarFunciones() throws SQLException, ClassNotFoundException {
        //1 Declaracion de variable
        CallableStatement sentencia = null;
        ResultSet rejilla = null;
        String sql = "select cantidades_existencia();";
        int resultado = 0;
        //2 Abrir la conexion
        abrirConexion();
        //3 Crar el Statement
        sentencia = miConexion.prepareCall(sql);
        //4 Ejecutar el statement
        rejilla = sentencia.executeQuery();
        if (rejilla.next()){
            resultado = rejilla.getInt("cantidades_existencia");
        }
        //5 Devolver el resultdo
        return resultado;

    }
}
