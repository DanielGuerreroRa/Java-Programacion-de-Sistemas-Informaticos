import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1.	Pedir dos números y decir si son iguales o no.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
        }
        scanner.close();

    }
}
