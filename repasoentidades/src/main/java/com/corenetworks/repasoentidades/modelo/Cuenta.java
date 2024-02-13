package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cuentas")
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    private double saldo;
    @Column(length = 5, nullable = false)
    private String estado;

    @ManyToOne
    @JoinColumn(name="nif", nullable = false, foreignKey = @ForeignKey(name="FK_cuentas_cliente"))
    private Cliente cliente;



}
