package com.corenetworks.cardenalidadesRepaso.modelo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "editoriales")
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    @Column(length = 60)
    private String nombreEditorial;
    @Column(length = 120,nullable = false)
    private String direccion;

    //OneToMany seimpre que queramos ver y consultar los libros desde el front
    //Siempre que ponemos mappedBy ponemos el nombre que pusimos private Editorial --> editorial; dentro de Libro
   // @OneToMany(mappedBy = "editorial", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
   // private List<Libro> libros;


}
