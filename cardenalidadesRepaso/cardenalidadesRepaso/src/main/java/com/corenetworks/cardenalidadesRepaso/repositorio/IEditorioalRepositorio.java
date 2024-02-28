package com.corenetworks.cardenalidadesRepaso.repositorio;

import com.corenetworks.cardenalidadesRepaso.modelo.Editorial;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEditorioalRepositorio extends JpaRepository<Editorial,Integer> {

    //Para filtrar el List por direccion
    @Query("from Editorial e where e.direccion = :direccion")
    List<Editorial> filtroPorDireccion(@Value("direccion") String direccion);

    //Para filtrar el List por nombre
    @Query(value = "Select e.id_editorial, direccion, nombre from editoriales e where e.nombre = :nombre", nativeQuery = true)//Esta es la orden que recibe BBDD 'PostgrSql'
    List<Editorial> filtroPorNombre(@Value("nombre") String nombre);

    //Para solicitar filtro por letra
    @Query(value = "Select e.id_editorial, direccion, nombre from editoriales e where e.nombre like :nombre%)//Esta es la orden que recibe BBDD 'PostgrSqln'", nativeQuery = true)
    List<Editorial> filtroPorLetraNombre(@Value("nombre") String nombre);


}
