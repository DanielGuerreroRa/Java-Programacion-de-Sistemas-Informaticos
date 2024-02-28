package com.corenetworks.cardenalidadesRepaso.repositorio;

import com.corenetworks.cardenalidadesRepaso.dto.LibroDto;
import com.corenetworks.cardenalidadesRepaso.dto.LibroEditorialDto;
import com.corenetworks.cardenalidadesRepaso.modelo.Libro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ILibroRepo extends JpaRepository<Libro,String> {
    @Query("SELECT  l FROM  Libro l JOIN FETCH l.editorial")
     List<Libro> obtenerLibrosEditorial();

    @Query("SELECT new com.corenetworks.cardenalidadesRepaso.dto.LibroDto(l.isbn, l.titulo) FROM Libro l")
    List<LibroDto> usarDto();

    @Query("SELECT new com.corenetworks.cardenalidadesRepaso.dto.LibroEditorialDto(l.isbn, l.titulo, l.editorial.nombreEditorial, l.editorial.direccion) FROM Libro l JOIN l.editorial WHERE l.editorial.idEditorial = :id ")
    List<LibroEditorialDto> usarDtoJoin(@Value("id") int id);

}
