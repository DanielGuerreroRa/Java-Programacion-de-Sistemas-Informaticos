package com.corenetworks.presentacion;

import com.corenetworks.negocio.CrearInforme;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ProbarTodo {
    public static void main(String[] args) {
        CrearInforme cI = new CrearInforme();
        Scanner teclado = new Scanner(System.in);
        String autor;
        System.out.println("Escriba el dni del autor -> ");
        autor = teclado.nextLine();
        try {
            cI.armarInforme(autor);
        } catch (IOException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
