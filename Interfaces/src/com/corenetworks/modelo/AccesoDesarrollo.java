package com.corenetworks.modelo;

public class AccesoDesarrollo implements IDAO {
    @Override
    public String insertar(Cliente c1) {

        return "Se inserta el cliente en DESARROLLO, " + c1.getNombre();
    }
}


