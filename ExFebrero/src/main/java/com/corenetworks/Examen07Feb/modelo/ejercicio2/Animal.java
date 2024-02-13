package com.corenetworks.Examen07Feb.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    @Column(length = 20,nullable = false)
    private String sexo;
    @Column(length = 40)
    private String idPais;
    @Column(length = 20)
    private LocalDate fNacimiento;

    @ManyToOne
    @JoinColumn(name = "id_especie", nullable = false, foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especie especies;
}
