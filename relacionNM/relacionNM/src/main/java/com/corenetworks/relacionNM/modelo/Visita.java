package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

//@Data aqui generaria un bucle, por lo que lo quitamos y generamos los setters del id no hace falta
//Y el ToString de id y fecha los demas vienen de sus clases
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "visitan")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;
    @Column(nullable = false)
    private LocalDate fVisita;


    @ManyToOne
    @JoinColumn(name = "matricula", nullable = false, foreignKey = @ForeignKey(name = "FK_visitan_autobuses"))
    private Autobus autobuses;


    @ManyToOne
    @JoinColumn(name = "id_lugar", nullable = false, foreignKey = @ForeignKey(name = "FK_visitan_lugares"))
    private Lugar lugares;


    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_visitan_conductores"))
    private Conductor conductores;

    @Override
    public String toString() {
        return "Visitan{" +
                "idVisita=" + idVisita +
                ", fVisita=" + fVisita +
                '}';
    }

    public Visita(int idVisita, LocalDate fVisita) {
        this.idVisita = idVisita;
        this.fVisita = fVisita;
    }

    public void setfVisita(LocalDate fVisita) {
        this.fVisita = fVisita;
    }

    public void setAutobuses(Autobus autobuses) {
        this.autobuses = autobuses;
    }

    public void setConductores(Conductor conductores) {
        this.conductores = conductores;
    }

    public void setLugares(Lugar lugares) {
        this.lugares = lugares;
    }
}
