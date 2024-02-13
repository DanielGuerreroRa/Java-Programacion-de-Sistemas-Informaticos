package com.corenetworks.relacionNM.servicio;

import com.corenetworks.relacionNM.modelo.Autobus;

import java.util.List;

public interface IAutobusServicio {

    Autobus insertar(Autobus a);
    Autobus modificar(Autobus a);
    void eliminar(String matricula);
    List<Autobus> mostrarTodos();
    Autobus mostrarUno(String matricula);
}
