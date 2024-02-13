package com.corenetworks.demoHibernate.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="departamentos")
public class Departamento {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idDepartamento;
    @Column(length = 60, nullable = false)
    private String descripcionDepartamento;

    @OneToMany(mappedBy = "d1", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    List<Empleado> empleados;

}
