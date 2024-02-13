package com.corenetworks.Examen07Feb.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Producto {

    private String nombre;
    private double precio;
}
