package com.corenetworks.negocio;

import com.corenetworks.modelo.Autor;
import com.corenetworks.modelo.Libro;
import com.corenetworks.persistencia.AccesoCasaLibro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class CrearInforme {

    public  void armarInforme(String dni) throws IOException, SQLException, ClassNotFoundException {


        try(FileWriter fSalida = new FileWriter("libros_por_autor.txt");
            PrintWriter altoNivel = new PrintWriter(fSalida))
        {
            //0. Declarar variables
            AccesoCasaLibro aCL = new AccesoCasaLibro();
            List<Libro> libros;
            //1. obtenemos los datos del autor
            Autor a1 = aCL.obtenerUnAutor(dni);
            //2. Arma el cabecero
            altoNivel.format("Nombre del autor: %s DNI: %s %n %n", a1.getNombre(), a1.getDni());
            altoNivel.format("%-20s %s %n","ISBN","TITULO");
            altoNivel.println("-".repeat(50)+"\n");

            libros = aCL.obtenerLibrosPorAutor(dni);
            //3. Realiza el detalle
            for (Libro elemento:
                 libros) {
                altoNivel.format("%-20s %s %n", elemento.getIsbn(), elemento.getTitulo());
            }

        }
    }
}
