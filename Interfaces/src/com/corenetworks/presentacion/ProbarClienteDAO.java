package com.corenetworks.presentacion;

import com.corenetworks.modelo.*;

public class ProbarClienteDAO {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juan","5321215J");
        AccesoDesarrollo aD1 = new AccesoDesarrollo();
        AccedoProduccion aP1 = new AccedoProduccion();
        ClienteDao cDao1 = new ClienteDao();
        cDao1.setConexion(aD1);
        System.out.println(cDao1.insertar(c1));
        cDao1.setConexion(aP1);
        System.out.println(cDao1.insertar(c1));



    }
}
