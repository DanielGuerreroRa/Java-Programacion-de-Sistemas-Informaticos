package com.corenetworks.Controlador.servicio;


import com.corenetworks.Controlador.modelo.Lugar;

import java.util.List;

public interface ILugarServicio {
    Lugar insertar(Lugar l);
    Lugar modificar(Lugar l);
    void eliminar(int idLugar);
    List<Lugar> mostrarTodos();
    Lugar mostrarUno(int idLugar);
}