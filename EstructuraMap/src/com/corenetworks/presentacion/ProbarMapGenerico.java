package com.corenetworks.presentacion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProbarMapGenerico {
    public static void main(String[] args) {

        Map<Integer,String> tablaAlumno = new HashMap<>();
        tablaAlumno.put(4155835,"Juan Lopez");
        tablaAlumno.put(4155842,"Laura Flores");
        System.out.println(tablaAlumno);
        System.out.println("El nombre de la matricula 4155835: " + tablaAlumno.get(4155835));
        System.out.println("El nombre de la matricula 4155842: " + tablaAlumno.get(4155842));
        System.out.println("Nombre de alumnos: " + tablaAlumno.values());
        System.out.println("Matriculas: " + tablaAlumno.keySet());
        System.out.println("Todos los datos en un set: " + tablaAlumno.entrySet());


        //Estrucura para almacenear como en un diccionario.
        //La palabra puede tener varias definiciones.

        Map<String, Set<String>> diccionario = new HashMap<>();
        String palabra = "banco";
        Set<String> definiciones = new HashSet<>();
        definiciones.add("Mueble para sentarse");
        definiciones.add("Institucion que gestiona dienro");
        definiciones.add("Agrupacion de peces");
        diccionario.put(palabra, definiciones);
        System.out.println("Diccionario " + diccionario);
        Set<String> definicion2 = new HashSet<>();
        definicion2.add("Animal mamifero que da leche");
        diccionario.put("vaca", definicion2);
        System.out.println(diccionario);
        diccionario.put("a", definicion2);
        System.out.println(diccionario);
        diccionario.put("z", definicion2);
        System.out.println(diccionario);

        }

    }

