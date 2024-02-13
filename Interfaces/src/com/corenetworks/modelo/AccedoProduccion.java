package com.corenetworks.modelo;

public class AccedoProduccion implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "Se inserta el cliente en PRODUCCIÓN, " + c1.getNombre();
    }
}
