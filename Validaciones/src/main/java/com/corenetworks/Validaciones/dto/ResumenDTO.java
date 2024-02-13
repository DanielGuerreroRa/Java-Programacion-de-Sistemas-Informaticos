package com.corenetworks.Validaciones.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
//Es un resumen de base de datos que le damos al front
//Esta enlazado con IEmpleadoRepositorio, IEmpleadoServicio, EmpleadoServicioImpl, EmpleadoControlador
public class ResumenDTO {
    private int contador;
    private double sueldoPromedio;
}
