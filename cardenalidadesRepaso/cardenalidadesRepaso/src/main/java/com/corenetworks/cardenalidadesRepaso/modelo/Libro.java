package com.corenetworks.cardenalidadesRepaso.modelo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    @Column(length = 20)
    private String isbn;
    @Column(length = 120)
    private String titulo;
    @Column(length = 60,nullable = false)
    private String autor;
    @Column(nullable = false)
    private double precio;

   // @JsonIgnore //para solucionar el problema de bucle que se repita Libro y Editorial
    @ManyToOne
    @JoinColumn(name = "id_editorial",nullable = false, foreignKey = @ForeignKey(name = "FK_libros_editorial"))
    private Editorial editorial;


}
