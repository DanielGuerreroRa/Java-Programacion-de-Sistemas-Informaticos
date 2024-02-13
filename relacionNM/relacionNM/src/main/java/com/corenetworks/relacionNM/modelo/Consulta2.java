package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consultas2")
public class Consulta2 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idConsulta;
    @Column(nullable = false)
    private LocalTime hora;
    @Column(nullable = false)
    private LocalDate fecha;

}
