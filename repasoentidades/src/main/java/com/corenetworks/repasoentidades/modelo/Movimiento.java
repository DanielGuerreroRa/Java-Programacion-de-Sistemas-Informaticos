package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="movimientos")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovimiento;
    @Column(nullable = false, length = 5)
    private String tipoMovimiento;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private  double cantidad;
    @ManyToOne
    @JoinColumn(name="id_cuenta", nullable = false, foreignKey = @ForeignKey(name="FK_movimientos_cuentas"))
    private Cuenta c1;

}
