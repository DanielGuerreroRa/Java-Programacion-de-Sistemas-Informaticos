package com.corenetworks.ejemploCont.servicio;

import com.corenetworks.ejemploCont.modelo.Carrito;

import java.util.List;

public interface ICarritoServicio {
    Carrito insertar(Carrito c);
    Carrito modificar(Carrito c);
    void eliminar(int id);
    Carrito consultarUno(int id);
    List<Carrito> consultarTodos();
}
