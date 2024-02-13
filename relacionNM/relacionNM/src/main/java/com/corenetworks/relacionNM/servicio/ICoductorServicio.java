package com.corenetworks.relacionNM.servicio;


import com.corenetworks.relacionNM.modelo.Conductor;

import java.util.List;

public interface ICoductorServicio {
    Conductor insertar(Conductor c);
    Conductor modificar(Conductor c);
    void eliminar(String dni);
    List<Conductor> mostrarTodos();
    Conductor mostrarUno(String matricula);
}
