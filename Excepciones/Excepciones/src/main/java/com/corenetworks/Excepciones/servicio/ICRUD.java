package com.corenetworks.Excepciones.servicio;

import java.util.List;

public interface ICRUD<T,ID> {
    List<T> listarTodos() throws Exception;
    T listarUno(ID id) throws Exception;
    T insertar(T t) throws Exception;
    T modificar(T t) throws Exception;
    void eliminar(ID id) throws Exception;

}
