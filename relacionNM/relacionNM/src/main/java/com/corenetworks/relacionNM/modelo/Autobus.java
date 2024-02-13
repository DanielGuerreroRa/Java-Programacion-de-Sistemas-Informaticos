package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "autobuses")
public class Autobus {
    @Id
    @Column(length = 7,nullable = false)
    private String matricula;
    @Column(nullable = false)
    private int aFabricacion;
    //Se le pone el mismo nombre que en el @ManytoOne de Visitan

    @OneToMany(mappedBy = "autobuses",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    List<Visita> visitas;

   //Generamos un constructos sin el List<Visitas>
    public Autobus(String matricula, int aFabricacion) {
        this.matricula = matricula;
        this.aFabricacion = aFabricacion;
    }
}
