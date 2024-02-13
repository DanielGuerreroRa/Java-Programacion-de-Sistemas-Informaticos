package com.corenetworks.MadurezRestfulL.servicio;



import java.util.List;

public interface ICRUD <T,ID> {
    T crear(T t);
    T modificar(T t);
    void eliminar(ID id);
    T consultarUno(ID id);
    List<T> consultarTodos();
}
