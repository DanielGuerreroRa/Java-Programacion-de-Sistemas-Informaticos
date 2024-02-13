package com.corenetwoks.demoSpring2.repositorio.Clase;

import com.corenetwoks.demoSpring2.modelo.Cliente;
import com.corenetwoks.demoSpring2.repositorio.Interface.IBBDD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class CapaPersistencia {
    @Autowired//Lo saca del contenedor para utilizarlo en el main
    private IBBDD baseDatos; //interface llamada

    public String insertar(Cliente c){
        return baseDatos.insertar(c);
    }
    public String eliminar(Cliente c) {
        return baseDatos.eliminar(c);
    }
    public String modificar(Cliente c) {
        return baseDatos.modificar(c);
    }
    public String consultar(Cliente c) {
        return baseDatos.consultar(c);
    }
}