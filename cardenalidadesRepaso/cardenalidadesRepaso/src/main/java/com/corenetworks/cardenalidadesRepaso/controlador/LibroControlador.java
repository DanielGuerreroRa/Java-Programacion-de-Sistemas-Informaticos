package com.corenetworks.cardenalidadesRepaso.controlador;

import com.corenetworks.cardenalidadesRepaso.dto.LibroDto;
import com.corenetworks.cardenalidadesRepaso.dto.LibroEditorialDto;
import com.corenetworks.cardenalidadesRepaso.modelo.Libro;
import com.corenetworks.cardenalidadesRepaso.servicio.ILibroServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroControlador {

    @Autowired
    private ILibroServicio servicioLibro;

    @GetMapping
    public List<Libro> obtenerJoin(){
        return servicioLibro.ejemploJoin();
    }

    @GetMapping ("/dto")
    public List<LibroDto> obtenerDto(){
        return servicioLibro.usaDto();
    }

    @GetMapping("/dtojoin/{id}")
    public List<LibroEditorialDto> obtenerDtoJoin(@PathVariable("id") int id){
        return servicioLibro.usarDtoJoin(id);
    }

}
