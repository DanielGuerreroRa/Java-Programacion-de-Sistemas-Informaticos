package com.corenetworks.repasoentidades.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="barcos")
public class Barco {
    @Id
    @Column(length = 11)
    private String matricula;
    @Column(nullable = false)
    private int amarre;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private double couta;

    @ManyToOne
    @JoinColumn(name="dni", nullable = false, foreignKey = @ForeignKey(name = "FK_barcos_socio"))
    private Socio socio;

    public Barco(String matricula, int amarre, String nombre, double couta) {
        this.matricula = matricula;
        this.amarre = amarre;
        this.nombre = nombre;
        this.couta = couta;
    }

    public Barco() {
    }

    @Override
    public String toString() {
        return "Barco{" +
                "matricula='" + matricula + '\'' +
                ", amarre=" + amarre +
                ", nombre='" + nombre + '\'' +
                ", couta=" + couta +
                '}';
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }
}
