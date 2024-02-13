package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "socios")
public class Socio {
    @Id
    @Column(length = 9)
    private String DNI;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;

    //Ocional - Solo si lo pide el front
    //Se pone "socio" porque es para instanciar el que declaramos en Barco con el @ManyToOne
    @OneToMany(mappedBy = "socio", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Barco> b1;


    public Socio(String DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", b1=" + b1 +
                '}';
    }

}
