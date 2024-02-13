package com.corenetworks.Validaciones.repositorio;

import com.corenetworks.Validaciones.dto.ResumenDTO;
import com.corenetworks.Validaciones.modelo.Empleado;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IEmpleadoRepositorio extends IGenericoRepositorio<Empleado,Integer>{
    @Query (value = "select count(id_empleado) as contador, avg(sueldo) as sueldo_promedio from empleados;", nativeQuery = true)
    public List<ResumenDTO> obtenerResumenes();
}