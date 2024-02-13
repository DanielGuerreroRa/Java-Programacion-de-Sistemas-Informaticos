import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Realizar un juego para adivinar un numero.
        //Calcular el numero a adivinar con la clase Random (1 al 10).
        //Luego ir mostrando numeros indicando mayor o menor segun sea mayor o menor respecto a N.
        //El proceso termina cuando el usuario acierta.
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio;
        int numero=5;

        // Obtención de número aleatorio
        numeroAleatorio = (int) (Math.random() * 10 + 1);
        System.out.println("El numero aleatorio es ");
        System.out.println(numeroAleatorio);
        if (numeroAleatorio>numero) {
            System.out.println("Es mayor que " + numero);
        }else {
            System.out.println("Es menos que " + numero);

        }

        }
    }
