package com.corenetworks.demoHibernate.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="centros_educativos")
public class CentroEducativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCentro;
    @Column(length = 120, nullable = false)
    private String direccion;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int integer;
    @OneToOne(mappedBy = "ce",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Concertado c1;




}

