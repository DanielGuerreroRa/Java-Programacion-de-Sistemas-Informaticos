package com.corenetworks.Validaciones.dto;

import com.corenetworks.Validaciones.modelo.Empleado;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpleadoDTO {
    private int idEmpleado;
    @NotEmpty
    @Size(min = 3, max = 60)
    private String nombreEmpleado;
    @NotNull
    private String dni;
    @Min(400)
    @Max(32000)
    private double sueldo;

    public Empleado castEmpleado(){
        Empleado e1 = new Empleado();
        e1.setIdEmpleado(this.getIdEmpleado());
        e1.setNombreEmpleado(this.getNombreEmpleado());
        e1.setDni(this.getDni());
        e1.setSueldo(this.getSueldo());
        return e1;
    }
    public EmpleadoDTO castEmpleadoDto(Empleado e){
        this.idEmpleado = e.getIdEmpleado();
        this.nombreEmpleado = e.getNombreEmpleado();
        this.dni = e.getDni();
        this.sueldo = e.getSueldo();
        return this;
    }

}
