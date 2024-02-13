package com.corenetworks.Examen07Feb.modelo.ejercicio1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Factura {

    @Autowired
    private IImpuesto impuesto;
    private List<Producto> productos;

    public double calcularTotalFactura() {
        double total = 0;
        for (Producto elemento : productos) {
            total += elemento.getPrecio() + impuesto.calcularImpuesto(elemento);
        }
        return total;
    }
}
