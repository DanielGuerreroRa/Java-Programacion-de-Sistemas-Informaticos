package com.corenetworks.cardenalidadesRepaso.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroEditorialDto {
    private String isbn;
    private String titulo;
    private String nombreEditorial;
    private String direccion;
}
