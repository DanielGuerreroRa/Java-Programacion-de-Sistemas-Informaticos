import java.util.Scanner;

public class Ejercicio7 {
    //7.	Pedir tres números y mostrarlos ordenados de mayor a menor.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3) {
            if (numero2 >= numero3) {
                System.out.println("Ordenados de mayor a menor: " + numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println("Ordenados de mayor a menor: " + numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            if (numero1 >= numero3) {
                System.out.println("Ordenados de mayor a menor: " + numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println("Ordenados de mayor a menor: " + numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println("Ordenados de mayor a menor: " + numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println("Ordenados de mayor a menor: " + numero3 + ", " + numero2 + ", " + numero1);
            }
        }
    }
}
