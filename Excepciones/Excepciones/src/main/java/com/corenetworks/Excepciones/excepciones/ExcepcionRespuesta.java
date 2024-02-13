package com.corenetworks.Excepciones.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcepcionRespuesta {
    private LocalDate fecha;
    private String mesaje;
    private String detalle;
}
