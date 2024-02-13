package com.corenetworks.Validaciones.servicio;

import java.util.List;

public interface ICRUD<T,ID> {
    List<T> mostrarTodos() throws Exception;
    T mostrarUno(ID id) throws Exception;

    T insertar(T t) throws Exception;
    T modificar(T t) throws Exception;
    void eliminar(ID id) throws Exception;

}