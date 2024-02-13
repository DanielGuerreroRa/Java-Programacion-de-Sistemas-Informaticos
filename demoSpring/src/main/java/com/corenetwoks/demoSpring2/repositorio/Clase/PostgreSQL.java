package com.corenetwoks.demoSpring2.repositorio.Clase;

import com.corenetwoks.demoSpring2.modelo.Cliente;
import com.corenetwoks.demoSpring2.repositorio.Interface.IBBDD;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary //Para darle la propiedad al archivo a la hora de llaamarlo desde el main
public class PostgreSQL implements IBBDD {
    @Override
    public String insertar(Cliente c){
        return String.format("El cliente %s esta insertado en la BBDD de PostreSQL ",c.toString());
    }
    @Override
    public String eliminar(Cliente c) {
        return String.format("El cliente %s esta eliminado en la BBDD de PostreSQL ",c.toString());
    }
    @Override
    public String modificar(Cliente c) {
        return String.format("El cliente %s esta modificado en la BBDD de PostreSQL ",c.toString());
    }
    @Override
    public String consultar(Cliente c) {
        return String.format("El cliente %s esta consultado en la BBDD de PostreSQL " ,c.toString());
    }
}
