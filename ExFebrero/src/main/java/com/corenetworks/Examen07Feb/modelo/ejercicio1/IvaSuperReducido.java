package com.corenetworks.Examen07Feb.modelo.ejercicio1;


import org.springframework.stereotype.Component;

@Component("IvaSR")

public class IvaSuperReducido implements IImpuesto {

    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio() * 0.10;
    }
}

