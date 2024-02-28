package com.corenetworks.cardenalidadesRepaso.servicio;

import com.corenetworks.cardenalidadesRepaso.modelo.Editorial;

import java.util.List;

public interface IEditorialServicio {
  //  Editorial crear(Editorial e);
   // Editorial modificar(Editorial e);
    void eliminar(int id);
    Editorial consultarUno(int id);
    List<Editorial> consultarTodos();


    //Para filtrar el List por direccion
    List<Editorial> filtroPorDireccion(String direccion);

    //Para filtrar el List por nombre
    List<Editorial> filtroPorNombre(String nombre);

    //Para solicitar filtro por letra
    List<Editorial> filtroPorLetraNombre(String nombre);

}
