package com.corenetworks.demoHibernate.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "animales")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;
    private char sexo;
    private int anio_nacimiento;
    @Column(length = 60,nullable = false)
    private String paisOrigen;
    @Column(length = 60,nullable = false)
    private String continente;
    @ManyToOne //Donde se ponen las llaves foraneas
    @JoinColumn(name="id_especie",nullable = false,foreignKey = @ForeignKey(name = "FK_animales_especies"))
    private Especie e1;
    @ManyToOne
    @JoinColumn(name="id_zoo",nullable = false,foreignKey = @ForeignKey(name = "FK_animales_zoos"))
    private Zoo z1 ;
}
