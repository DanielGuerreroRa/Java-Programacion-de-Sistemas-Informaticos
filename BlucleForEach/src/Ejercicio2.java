import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Crear un bloque de codigo que lea los componentes de un array  de enteros y me pinte cuales son pares.
        //Cuales son multiplos de tres.
        //Para este ejerccio utilizar un bucle que recorra el array y utilizar el operador %.
        Scanner teclado = new Scanner(System.in);
        int[] numeros= new int[5];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Escribe el numero -> " + i + " -> ");
            numeros[i]= teclado.nextInt();
            if (numeros[i]%2==0) {
                System.out.println(" Es par ");
            }else {
                System.out.println("No es par");
            }if (numeros[i]%3==0) {
                System.out.println(" Es multiplo de 3 ");
            }else {
                System.out.println("No es multiplo de 3");

            }
            }
        }


    }
