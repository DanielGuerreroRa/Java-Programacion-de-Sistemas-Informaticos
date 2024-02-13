package com.corenetworks.Validaciones.servicio;

import com.corenetworks.Validaciones.dto.ResumenDTO;
import com.corenetworks.Validaciones.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio extends ICRUD<Empleado,Integer>{
    public List<ResumenDTO> obtenerResumenes();
}
