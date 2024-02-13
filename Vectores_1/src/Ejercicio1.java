import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Leer por consola una frase
        // Contar cuantas vocales tiene
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Escriba la frase -> ");
        String frase = tecladoEntrada.nextLine();
        int numeroDeVocales = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vocales.length; j++){
                if (frase.charAt(i)==vocales[j]){
                    numeroDeVocales++;
                }
            }
        }
        System.out.println("La frase tiene " + numeroDeVocales + " vocales");
    }
}
