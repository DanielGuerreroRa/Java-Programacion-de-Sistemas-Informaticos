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
@Table(name = "productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    @Column(length = 30, nullable = false)
    private String nombre;
    @Column(length = 60, nullable = false)
    private String descripcion;
    @Column(nullable = false)
    private double precio;
    @Column(nullable = false)
    private int cantidadExistencia;
    @ManyToMany
    @JoinTable(name = "producto_proveedores", joinColumns = @JoinColumn(name = "id_producto",
            referencedColumnName = "id_producto"),inverseJoinColumns = @JoinColumn(name = "id_proveedor",
            referencedColumnName = "idProveedor"))

    private List<Proveedores> proveedores;

}