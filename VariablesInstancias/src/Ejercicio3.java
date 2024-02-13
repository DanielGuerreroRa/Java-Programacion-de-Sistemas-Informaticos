import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
    //3.	Pedir un número y decir si es par o impar.
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if(numero % 2 == 0) {
                System.out.println("El número es par.");
            } else {
                System.out.println("El número es impar.");
            }
            scanner.close();
    }
}
