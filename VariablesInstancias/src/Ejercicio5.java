import java.util.Scanner;

public class Ejercicio5 {
    //5.	Pedir dos números y decir cual es el mayor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if(numero1 < numero2) {
            System.out.println(numero2 + " es mayor que " + numero1);
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}
