import java.util.Scanner;

public class Ejercicio4 {
    //4.	Pedir dos números y decir si uno es múltiplo del otro.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Uno de los números es múltiplo del otro.");
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }
    }

}
