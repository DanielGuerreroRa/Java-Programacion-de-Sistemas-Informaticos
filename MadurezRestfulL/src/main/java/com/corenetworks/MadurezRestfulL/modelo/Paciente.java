package com.corenetworks.MadurezRestfulL.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "pacientes")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    @Column(length = 9,nullable = false, unique = true)//unique=true para que no existan dos pacientes con el mismo dni
    private String dni;
    @Column(length = 60,nullable = false)
    private String nombre;

}
