package com.corenetworks.presentacion;

import com.corenetworks.modelo.Socio;
import com.corenetworks.persistencia.AccesoSocio;

import java.sql.SQLException;

public class ProbarSocios {
    public static void main(String[] args) {
        AccesoSocio as = new AccesoSocio();
        Socio s = new Socio("1234567A", "123456");
        try {
            System.out.println("Se a insertado el socio? " + as.alta(s));
        }catch (ClassNotFoundException e){
            System.out.println(e.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
