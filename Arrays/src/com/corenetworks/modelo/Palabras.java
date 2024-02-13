package com.corenetworks.modelo;

import java.util.Scanner;

public class Palabras {
    //Atributos
    private String[] palabras;

    //Metodos
    public void actualizaElemeto(String contenido, int posicion) {
        //Conteido se guarda en array en la posicion
        palabras[posicion]=contenido;
        }
        //Constructor
    public Palabras( int elemento){
        palabras=new String[elemento];
        }
        //Setters y Getters

        public String[] getPalabras () {
            return palabras;
        }

        public void setPalabras (String[]palabras){
            this.palabras = palabras;
        }
    }


