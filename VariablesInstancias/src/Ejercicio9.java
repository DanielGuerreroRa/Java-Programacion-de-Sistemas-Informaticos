import java.util.Scanner;

public class Ejercicio9 {
    //9.	Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entre 0 y 9,999: ");
        int numero = scanner.nextInt();

        int invertido = 0;

        if (numero >= 0 && numero <= 9) {
            invertido = numero;
        } else if (numero >= 10 && numero <= 99) {
            invertido = numero % 10 * 10 + numero / 10;
        } else if (numero >= 100 && numero <= 999) {
            invertido = numero % 10 * 100 + (numero / 10 % 10) * 10 + numero / 100;
        } else if (numero >= 1000 && numero <= 9999) {
            invertido = numero % 10 * 1000 + (numero / 10 % 10) * 100 + (numero / 100 % 10) * 10 + numero / 1000;
        }

        System.out.println("El número invertido es: " + invertido);
    }
}
