package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cuentas_ahorro")

public class CuentaAhorro {
    @Id
    private int idCuenta;
    @Column(nullable = false)
    private double interesMensual;
    @OneToOne
    @JoinColumn(name="id_cuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_cuentas_ahorro_cuentas"))
    private Cuenta cuenta;
}
