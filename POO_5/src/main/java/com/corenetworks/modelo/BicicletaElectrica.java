package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class BicicletaElectrica extends Bicicleta{
    private double potencia;
    private double velocidad;

    @Override
    public String toString() {
        return "BicicletaElectrica{" +
                "potencia=" + potencia +
                '}';
    }

    @Override
    public void incrementar(double incvelocidad) {
        velocidad += incvelocidad*1.2;
    }

    public BicicletaElectrica(int platos, int pinones, double velocidad, double potencia) {
        super(platos, pinones, velocidad);
        this.potencia = potencia;
    }
}
