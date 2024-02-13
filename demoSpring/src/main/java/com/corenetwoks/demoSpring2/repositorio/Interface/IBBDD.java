package com.corenetwoks.demoSpring2.repositorio.Interface;

import com.corenetwoks.demoSpring2.modelo.Cliente;

public interface IBBDD {
    String insertar(Cliente c);


    String eliminar(Cliente c);


    String modificar(Cliente c);

    public String consultar(Cliente c);
}
