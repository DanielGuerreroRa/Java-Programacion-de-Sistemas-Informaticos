package com.corenetworks.presentacion;

import com.corenetworks.modelo.Tienda;
import com.corenetworks.persistencia.AccesoCasaLibro;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class ProbarPorPartes {
    public static void main(String[] args) {
        Tienda t1 = new Tienda(0,"Madrid",new BigDecimal(3000));
        AccesoCasaLibro aCL1 = new AccesoCasaLibro();
        try {
//            System.out.println("Se ha podido dar de alta ? " + aCL1.insertarTienda(t1));
            System.out.println("La tienda 1 tiene los datos " + aCL1.obtenerUnaTienda(1));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
