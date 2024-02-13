package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@NoArgsConstructor
@Entity
@Table(name = "conductores")
public class Conductor {
    @Id
    @Column(length = 9,nullable = false)
    private String dni;
    @Column(length = 20,nullable = false)
    private String nombre;
//    @OneToMany(mappedBy = "conductores",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    List<Visita> visitas;

    //Generamos un constructos sin el List<Visitas>


    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
}
