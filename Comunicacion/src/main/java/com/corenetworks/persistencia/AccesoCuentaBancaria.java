package com.corenetworks.persistencia;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoCuentaBancaria extends Conexion {
    public double solicitarSaldo(String numTarjeta) throws SQLException, ClassNotFoundException {
        //declarar variables
        PreparedStatement sentencia = null;
        String sql = "select saldo from cuenta_bancaria where no_tarjeta = ?";
        double resultado = 0;
        ResultSet rejilla = null;
        //abrir conexion
        abrirConexion();
        //crear statement
        sentencia=miConexion.prepareStatement(sql);
        sentencia.setString(1,numTarjeta);
        //ejecutarlo
        rejilla= sentencia.executeQuery();
        //obtener resultado
        if(rejilla.next()){
            System.out.println(rejilla.getString("saldo"));
            resultado=Double.parseDouble(rejilla.getString("saldo").replace("€","").replace(".","").replace(",","."));
        }
        //devolver
        return resultado;
    }



    public String obtenerPin(String numTarjeta) throws SQLException, ClassNotFoundException {
            //declarar variables
            PreparedStatement sentencia = null;
            String sql = "select pin from cuenta_bancaria where no_tarjeta = ?";
            String resultado = null;
            ResultSet rejilla = null;
            //abrir conexion
            abrirConexion();
            //crear statement
            sentencia=miConexion.prepareStatement(sql);
            sentencia.setString(1,numTarjeta);
            //ejecutarlo
            rejilla= sentencia.executeQuery();
            //obtener resultado
            if(rejilla.next()){
                System.out.println(rejilla.getString("pin"));
                resultado=(rejilla.getString("pin"));
            }
            //devolver
            return resultado;
        }

    public void actualizarSaldo(String numTarjeta,double cantidad) throws SQLException, ClassNotFoundException {
        //declarar variables
        PreparedStatement sentencia = null;
        String sql = "update cuenta_bancaria set saldo = saldo + cast(? as money) where no_tarjeta=?";


        //abrir conexion
        abrirConexion();
        //crear statement
        sentencia=miConexion.prepareStatement(sql);
        sentencia.setBigDecimal(1,new BigDecimal(cantidad));
        sentencia.setString(2,numTarjeta);
        //ejecutarlo
        sentencia.executeUpdate();
        //obtener resultado ( no por que es void)

    }
    }

