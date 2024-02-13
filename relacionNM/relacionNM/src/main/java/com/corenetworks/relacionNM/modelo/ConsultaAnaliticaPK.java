package com.corenetworks.relacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "consulta_analitica_2")
public class ConsultaAnaliticaPK implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_consulta", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_analitica_cosulta2"))
    private Consulta2 consulta;
    @Id
    @ManyToOne
    @JoinColumn(name = "id_analitica", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_analitica_analitica2"))
    private Analitica2 analitica;

}
