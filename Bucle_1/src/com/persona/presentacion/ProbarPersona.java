package com.persona.presentacion;

import com.persona.modelo.AtributosPersona;

import java.util.Scanner;

public class ProbarPersona {
    public static void main(String[] args) {

    }
    Scanner teclado = new Scanner(System.in);
    AtributosPersona p1 = new AtributosPersona();

    public void setP1(AtributosPersona p1) {

        p1.nombre="Daniel";
        p1.colorPelo="Rubio";
        p1.Dni="53824105P";
        p1.peso=88.9;
        p1.altura=1.81;
        p1.estadoCivil='P';
        p1.genero='V';
        System.out.println(p1.nombre);



    }
}
