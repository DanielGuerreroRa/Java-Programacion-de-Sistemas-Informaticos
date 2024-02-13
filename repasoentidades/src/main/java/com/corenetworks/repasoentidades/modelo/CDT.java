package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="cdt_s")
public class CDT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInversion;
    @Column(nullable = false)
    private LocalDate fApertura;
    @Column(nullable = false)
    private double interesesMensuales;
    @Column(nullable = false)
    private  double valorInversion;
    @Column(length = 5, nullable = false)
    private String estadoCDT;
    @ManyToOne
    @JoinColumn(name="id_cuenta", nullable = false, foreignKey = @ForeignKey(name = "FK_cdt_s_cuentas"))
    private Cuenta c1;

}
