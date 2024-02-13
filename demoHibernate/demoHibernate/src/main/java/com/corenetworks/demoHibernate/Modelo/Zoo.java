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
@Table(name = "zoos")
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZoo;
    @Column(length = 60,nullable = false)
    private String nombre;
    @Column(length = 50,nullable = false)
    private String pais;
    @Column(length = 50,nullable = false)
    private String ciudad;
    private double tamano;
    private double money;
    //Es opcional ponerlo, solo si lo pide el front
    @OneToMany(mappedBy = "z1",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    List<Animal> Animales;
}