package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "patrones")
public class Patron {
    @Id
    @Column(length = 9)
    private String DNI;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 120, nullable = false)
    private String direccion;

    //Ocional - Solo si lo pide el front
    //Se pone "socio" porque es para instanciar el que declaramos en patron con el @ManyToOne
    @OneToMany(mappedBy = "patron", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Salida> s1;

    public Patron(String DNI, String nombre, String direccion) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void setS1(List<Salida> s1) {
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", s1=" + s1 +
                '}';
    }
}
