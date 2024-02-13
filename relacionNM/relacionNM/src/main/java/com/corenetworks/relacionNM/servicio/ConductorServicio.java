package com.corenetworks.relacionNM.servicio;

import com.corenetworks.relacionNM.modelo.Conductor;
import com.corenetworks.relacionNM.repositorio.ICoductorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


//Poner el @Service
@Service
public class ConductorServicio implements ICoductorServicio{
    //Implemetamos IautobusServicio y a sus metodos
    @Autowired
    private ICoductorRepositorio repoConductor;

    @Override
    public Conductor insertar(Conductor c) {
        return repoConductor.save(c);
    }

    @Override
    public Conductor modificar(Conductor c) {
        return repoConductor.save(c);
    }

    @Override
    public void eliminar(String dni) {
        repoConductor.deleteById(dni);

    }

    @Override
    public List<Conductor> mostrarTodos() {
        return repoConductor.findAll();
    }

    @Override
    public Conductor mostrarUno(String dni) {
        return repoConductor.findById(dni).orElse(new Conductor());
    }
}
