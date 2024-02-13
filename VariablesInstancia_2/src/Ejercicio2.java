import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Pedir dos numero y decir si son iguales o no
        Scanner compararEdad = new Scanner(System.in);
        System.out.println("¿Los dos numero son iguales?");
        int numeroUno = compararEdad.nextInt();
        int numeroDos = compararEdad.nextInt();
        if (numeroUno==numeroDos) {
            System.out.println("son iguales");
        } else {
            System.out.println("No son iguales");

        }


    }
}
