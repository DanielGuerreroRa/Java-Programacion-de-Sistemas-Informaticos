package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Factura {
    private int id;
    private LocalDate fFactura;
    private String formaPago;
    private String formaEnvio;
    private double importe;


    //Sobrecarga
    public double calcularIva (){
        return importe * 0.21;
    }
    public double calcularIva (double porcentaje ){
        return importe * porcentaje;
    }

}
