package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Bicicleta {
    private int platos;
    private int pinones;
    private double velocidad;

    public void incrementar(double velocidad){
        this.velocidad += velocidad;
    }
}
