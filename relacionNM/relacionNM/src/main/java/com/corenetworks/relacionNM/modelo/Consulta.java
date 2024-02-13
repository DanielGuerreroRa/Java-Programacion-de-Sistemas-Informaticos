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
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idConsulta;
    @Column(nullable = false)
    private LocalTime hora;
    @Column(nullable = false)
    private LocalDate fecha;
    //En @JoinTable tenemos que poner el nombre de la tabla que queremos enlazar
    //En este caso como utulizamos @JoinTable tenemos que poner un joinColums con j minuscula  "s" en plural y sin el @
    @ManyToMany
    @JoinTable (name = "consultas analiticas", joinColumns = @JoinColumn( name = "idConsulta " ,referencedColumnName = "idConsulta" ),
            inverseJoinColumns = @JoinColumn (name = " id_Analitica", referencedColumnName  ="idAnalitica"))
    private List<Analitica> analiticas;

}
