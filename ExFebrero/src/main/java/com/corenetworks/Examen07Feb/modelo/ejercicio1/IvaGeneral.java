package com.corenetworks.Examen07Feb.modelo.ejercicio1;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("IvaG")
@Primary
public class IvaGeneral implements IImpuesto {


    @Override
    public double calcularImpuesto(Producto p1) {
        return p1.getPrecio() * 0.21;
    }
}
