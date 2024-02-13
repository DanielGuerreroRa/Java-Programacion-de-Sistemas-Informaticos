package com.corenetworks.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido implements Serializable {
    private int idPedido;
    private String nombreCliente;
    private double importe;
    private String formaEnvio;
}
