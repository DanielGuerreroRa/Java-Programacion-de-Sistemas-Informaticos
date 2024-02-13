import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear un bloque de codigo que pinte las vocales
        //Y solo las vocales que existen en un array de caracteres.
        //El progreso debe ir comprobando, con un bucle, para determinar si cada caracter del array es o no una vocal.

        char[] letras = {'a', 'b', 'd', 'e', 'g'};
        for (int i = 0; i < letras.length; i++){
            switch (letras[i]){
                case 'a','A','e','E','i','I','o','O','u','U':
                    System.out.println("Es vocal -> "+ letras[i] + " esta en la posicion " + i);
                    break;
            }

        }

    }
}
