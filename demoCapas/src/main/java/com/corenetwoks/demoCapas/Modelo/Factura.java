package com.corenetwoks.demoCapas.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura {
    private int idFactura;
    private LocalDate fFactura;
    private double importe;

}
