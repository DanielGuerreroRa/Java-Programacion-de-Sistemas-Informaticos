import java.util.Scanner;

public class Ejercicio8 {
   //8.	Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Ingresa un número entre 0 y 9,999: ");
       int numero = scanner.nextInt();

       if (numero >= 0 && numero <= 9) {
           System.out.println("El número tiene 1 cifra.");
       } else if (numero >= 10 && numero <= 99) {
           System.out.println("El número tiene 2 cifras.");
       } else if (numero >= 100 && numero <= 999) {
           System.out.println("El número tiene 3 cifras.");
       } else if (numero >= 1000 && numero <= 9999) {
           System.out.println("El número tiene 4 cifras.");
       } else {
           System.out.println("El número no está dentro del rango especificado.");
       }
   }
}
