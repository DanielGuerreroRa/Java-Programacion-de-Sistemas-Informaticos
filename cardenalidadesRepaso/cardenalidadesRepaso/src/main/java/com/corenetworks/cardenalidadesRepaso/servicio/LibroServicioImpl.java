package com.corenetworks.cardenalidadesRepaso.servicio;

import com.corenetworks.cardenalidadesRepaso.dto.LibroDto;
import com.corenetworks.cardenalidadesRepaso.dto.LibroEditorialDto;
import com.corenetworks.cardenalidadesRepaso.modelo.Libro;
import com.corenetworks.cardenalidadesRepaso.repositorio.ILibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServicioImpl implements ILibroServicio{
    @Autowired
    private ILibroRepo repoLibro;


    @Override
    public List<Libro> ejemploJoin() {
        return repoLibro.obtenerLibrosEditorial();
    }

    @Override
    public List<LibroDto> usaDto() {
        return repoLibro.usarDto();
    }

    @Override
    public List<LibroEditorialDto> usarDtoJoin(int id) {
        return repoLibro.usarDtoJoin( id);
    }



}
