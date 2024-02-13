package com.corenetworks.Validaciones.servicio.impl;

import com.corenetworks.Validaciones.dto.ResumenDTO;
import com.corenetworks.Validaciones.modelo.Empleado;
import com.corenetworks.Validaciones.repositorio.IEmpleadoRepositorio;
import com.corenetworks.Validaciones.repositorio.IGenericoRepositorio;
import com.corenetworks.Validaciones.servicio.IEmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicioImpl extends CRUDImpl<Empleado,Integer> implements IEmpleadoServicio {
    @Autowired
    private IEmpleadoRepositorio repo;
    @Override
    protected IGenericoRepositorio<Empleado, Integer> getRepo() {
        return repo;
    }

    @Override
    public List<ResumenDTO> obtenerResumenes() {
        return repo.obtenerResumenes();
    }
}