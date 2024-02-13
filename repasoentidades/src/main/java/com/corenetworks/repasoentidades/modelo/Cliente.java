package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    private String nif;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;
    private LocalDate fApertura;

}
