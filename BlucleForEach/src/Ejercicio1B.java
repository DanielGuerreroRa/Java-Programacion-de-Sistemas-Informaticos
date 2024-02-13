import java.util.Scanner;

public class Ejercicio1B {
    public static void main(String[] args) {
        //Leer por consola una frase y contar cuantas vocales tiene.
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        int contadorVocales = 0;
        System.out.println("Escribe la frase -> ");
        for (int i = 0; i<frase.length();i++){
            switch (frase.charAt(i)){
                case 'a','e','i','o','u':
                    contadorVocales++;
                    break;
            }
        }
        System.out.println("La frase tiene " + contadorVocales + " vocales");
    }


}
