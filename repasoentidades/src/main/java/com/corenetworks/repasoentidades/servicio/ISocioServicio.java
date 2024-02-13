package com.corenetworks.repasoentidades.servicio;

import com.corenetworks.repasoentidades.modelo.Socio;

import java.util.List;

public interface ISocioServicio {

    List<Socio> mostrarTodos();
    Socio mostrarUno(String dni);
    Socio insertar(Socio s1);
    Socio modificar(Socio s1);
    void eliminar(String dni);

}
