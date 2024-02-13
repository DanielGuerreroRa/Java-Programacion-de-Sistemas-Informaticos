package com.corenetworks.repasoentidades.servicio;

import com.corenetworks.repasoentidades.modelo.Patron;


import java.util.List;

public interface IPatronServicio {
    List<Patron> mostrarTodos();
    Patron mostrarUno(String dni);
    Patron insertar(Patron p1);
    Patron modificar(Patron p1);
    void eliminar(String dni);
}
