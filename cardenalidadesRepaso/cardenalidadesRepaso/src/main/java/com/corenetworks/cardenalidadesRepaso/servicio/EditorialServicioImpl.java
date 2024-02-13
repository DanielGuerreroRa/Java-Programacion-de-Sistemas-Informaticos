package com.corenetworks.cardenalidadesRepaso.servicio;

import com.corenetworks.cardenalidadesRepaso.modelo.Editorial;
import com.corenetworks.cardenalidadesRepaso.modelo.Libro;
import com.corenetworks.cardenalidadesRepaso.repositorio.IEditorioalRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EditorialServicioImpl implements IEditorialServicio{
    @Autowired
    private IEditorioalRepositorio repoEditorial;
    @Override
    public Editorial crear(Editorial e) {
        for (Libro elemento: e.getLibros()){// a cada libro hay que ponerle la editorial
            elemento.setEditorial(e);
        }
        return repoEditorial.save(e);
    }

    @Override
    public Editorial modificar(Editorial e) {
        for (Libro elemento: e.getLibros()){// a cada libro hay que ponerle la editorial
            elemento.setEditorial(e);
        }
        return repoEditorial.save(e);
    }

    @Override
    public void eliminar(int id) {
        repoEditorial.deleteById(id);

    }

    @Override
    public Editorial consultarUno(int id) {
        return repoEditorial.findById(id).orElse(new Editorial());
    }

    @Override
    public List<Editorial> consultarTodos() {
        return repoEditorial.findAll();
    }


    //Para filtrar el List por direccion
    @Override
    public List<Editorial> filtroPorDireccion(String direccion) {
        return repoEditorial.filtroPorDireccion(direccion);
    }

    //Para filtrar el List por nombre
    @Override
    public List<Editorial> filtroPorNombre(String nombre) {
        return repoEditorial.filtroPorNombre(nombre);
    }

    @Override
    public List<Editorial> filtroPorLetraNombre(String nombre) {
        return repoEditorial.filtroPorNombre(nombre);
    }
}
