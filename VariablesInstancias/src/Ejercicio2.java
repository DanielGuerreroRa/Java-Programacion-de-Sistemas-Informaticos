import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        //2.	Pedir un número e indicar si es positivo o negativo.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if(numero > 0) {
            System.out.println("El número es positivo.");
        } else if(numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        scanner.close();

    }
}
