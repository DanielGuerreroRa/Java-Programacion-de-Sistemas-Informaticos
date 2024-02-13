package com.corenetworks.persistencia;

import com.corenetworks.modelo.Empleado;
import com.corenetworks.modelo.Shippers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoShippers extends Conexion {

    public boolean alta(Shippers s) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        int resultado=0;
        String sql = "insert into shippers (shipper_id,company_name,phone ) values (?,?,?);";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,s.getShipperId());
        sentencia.setString(2,s.getCompanyName());
        sentencia.setString(3,s.getPhone());

        //4. Actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado>0;

    }

    //Crear un método para modificar el teléfono
    //Entrada -> Shipper
    //Salida -> boolean
    public boolean modificar(Shippers s) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        int resultado=0;
        String sql = "update shippers set phone = ? where shipper_id = ?;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setString(1,s.getPhone());
        sentencia.setInt(2,s.getShipperId());
        //4. Actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado>0;

    }

    //Eliminar
    //Entrada -> id
    //Salida -> boolean

    public boolean eliminar(int id) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        int resultado=0;
        String sql = "delete from shippers where shipper_id = ?;";
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,id);
        //4. Actualizar
        resultado = sentencia.executeUpdate();
        //5. Devolver el resultado
        return resultado>0;

    }

    //Consultar uno
    //Entrada -> id
    //Salida -> Shipper

    public Shippers consultarUnShipper(int id) throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        PreparedStatement sentencia;
        Shippers resultado=null;
        String sql = "Select shipper_id, Company_name, phone from shippers where shipper_id = ?;";
        ResultSet rejilla = null;
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.prepareStatement(sql);
        //3a dar valor a los parámetros
        sentencia.setInt(1,id);
        //4. Actualizar
        rejilla = sentencia.executeQuery();
        if(rejilla.next()){
            resultado = new Shippers(rejilla.getInt("shipper_id")
                    ,rejilla.getString("Company_name")
                    ,rejilla.getString("phone"));
        }
        //5. Devolver el resultado
        return resultado;
    }
    //Consultar todos
    public List<Shippers> consultarTodosShipper() throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        Statement sentencia;
        List<Shippers> resultado= new ArrayList<>();
        String sql = "Select shipper_id, Company_name, phone from shippers";
        ResultSet rejilla = null;
        //2. Abrir la conexion
        abrirConexion();
        //3. Crear el statement
        sentencia = miConexion.createStatement();

        //4. Actualizar
        rejilla = sentencia.executeQuery(sql);
        while(rejilla.next()){
            resultado.add( new Shippers(rejilla.getInt("shipper_id")
                    ,rejilla.getString("Company_name")
                    ,rejilla.getString("phone")));
        }
        //5. Devolver el resultado
        return resultado;
    }



}
