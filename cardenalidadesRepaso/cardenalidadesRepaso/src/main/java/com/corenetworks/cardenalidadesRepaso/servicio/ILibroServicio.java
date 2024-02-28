package com.corenetworks.cardenalidadesRepaso.servicio;

import com.corenetworks.cardenalidadesRepaso.dto.LibroDto;
import com.corenetworks.cardenalidadesRepaso.dto.LibroEditorialDto;
import com.corenetworks.cardenalidadesRepaso.modelo.Libro;

import java.util.List;

public interface ILibroServicio {

    List<Libro> ejemploJoin();

    List<LibroDto> usaDto();

    List<LibroEditorialDto> usarDtoJoin(int id);
}
