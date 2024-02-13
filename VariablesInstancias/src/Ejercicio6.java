import java.util.Scanner;

public class Ejercicio6 {
    //6.	Pedir dos números y mostrarlos ordenados de mayor a menor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Ordenados de mayor a menor: " + numero2 + ", " + numero1);
    }
}
