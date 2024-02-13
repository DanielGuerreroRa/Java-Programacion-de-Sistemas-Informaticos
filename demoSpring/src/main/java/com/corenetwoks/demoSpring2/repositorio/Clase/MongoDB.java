package com.corenetwoks.demoSpring2.repositorio.Clase;

import com.corenetwoks.demoSpring2.modelo.Cliente;
import com.corenetwoks.demoSpring2.repositorio.Interface.IBBDD;
import org.springframework.stereotype.Component;


@Component
public class MongoDB implements IBBDD {
    @Override
    public String insertar(Cliente c){
        return String.format("El cliente %s esta insertado en la BBDD de MongoDB ",c.toString());
    }
    @Override
    public String eliminar(Cliente c) {
        return String.format("El cliente %s esta eliminado en la BBDD de MongoDB ",c.toString());
    }
    @Override
    public String modificar(Cliente c) {
        return String.format("El cliente %s esta modificado en la BBDD de MongoDB ",c.toString());
    }
    @Override
    public String consultar(Cliente c) {
        return String.format("El cliente %s esta consultado en la BBDD de MongoDB ",c.toString());
    }
}