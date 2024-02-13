package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "analiticas2")

public class Analitica2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnalitica;
    @Column(length = 60, nullable = false)
    private String descripcion;
    @Column(length = 5,nullable = false)
    private String sala;
}
