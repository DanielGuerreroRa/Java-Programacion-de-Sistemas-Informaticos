package com.corenetworks.presentacion.cajero;

import com.corenetworks.persistencia.AccesoCuentaBancaria;

import java.sql.SQLException;

public class ProbarSaldo {
    public static void main(String[] args) {
        AccesoCuentaBancaria aCB = new AccesoCuentaBancaria();
        try {
            aCB.actualizarSaldo("566993",-100);
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
