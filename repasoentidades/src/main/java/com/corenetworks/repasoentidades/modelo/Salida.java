package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="salidas")
public class Salida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSalida;
    private LocalDate fSalida;
    private LocalTime hSalida;
   @ManyToOne
   @JoinColumn(name="matricula", nullable = false, foreignKey = @ForeignKey(name="FK_salidas_barco"))
    private Barco barco;

    @ManyToOne
    @JoinColumn(name="dni", nullable = false, foreignKey = @ForeignKey(name="FK_salidas_patron"))
    private Patron patron;

    @Override
    public String toString() {
        return "Salida{" +
                "idSalida=" + idSalida +
                ", fSalida=" + fSalida +
                ", hSalida=" + hSalida +
                ", barco=" + barco +
                '}';
    }


    public void setPatron(Patron patron) {
        this.patron = patron;
    }

    public Salida(int idSalida, LocalDate fSalida, LocalTime hSalida) {
        this.idSalida = idSalida;
        this.fSalida = fSalida;
        this.hSalida = hSalida;
    }
}
