package com.corenetworks.Examen07Feb.modelo.ejercicio2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "especies")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecie;
    @Column(length = 60,nullable = false)
    private String nombreVulgar;
    @Column(length = 60)
    private String nombreCientifico;
    @Column(length = 20)
    private String extincion;

    @OneToMany(mappedBy = "especies",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Animal> animales;




}
