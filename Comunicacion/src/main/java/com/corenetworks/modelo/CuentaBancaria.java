package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CuentaBancaria {
 private String id;
 private String tipoOperacion;
 private double cantidad;

    }

