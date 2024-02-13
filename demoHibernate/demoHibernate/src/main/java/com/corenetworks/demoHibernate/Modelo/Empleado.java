package com.corenetworks.demoHibernate.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int edad;
    @ManyToOne
    @JoinColumn(name = "id_departamento",nullable = false,foreignKey = @ForeignKey(name = "FK_empleados_departamentos"))
    private Departamento d1;

}
