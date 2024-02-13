package com.corenetworks.presetacion;

public class EjercicioString {
    public static void main(String[] args) {
        // Frase dada
        String frase = "DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";

        // Número de caracteres
        int numeroCaracteres = frase.length();
        System.out.println("Número de caracteres del texto: " + numeroCaracteres);

        // Posición de la primera palabra "DevOps"
        int posicionDevOps = frase.indexOf("DevOps");
        System.out.println("Posición de la primera palabra: " + posicionDevOps);

        // Posición de la última palabra "menos"
        int posicionMenos = frase.lastIndexOf("menos");
        System.out.println("Posición de la última palabra 'menos': " + posicionMenos);

        // Texto en mayúscula
        String textoMayuscula = frase.toUpperCase();
        System.out.println("Texto en mayúscula: " + textoMayuscula);

        // Texto en minúscula
        String textoMinuscula = frase.toLowerCase();
        System.out.println("Texto en minúscula: " + textoMinuscula);

        // Extracción de la primera palabra "trabajo"
        System.out.println("Extraer trabajo (" + frase.substring(frase.indexOf("trabajo"),frase.indexOf("trabajo")+"trabajo".length())+")");
    }
}