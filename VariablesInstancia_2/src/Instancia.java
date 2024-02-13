import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Instancia {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Variables Instancia");
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Escriba su edad");
        int edad = 0;
        edad = tecladoEntrada.nextInt();
        System.out.println("El dato leido es -> "+ edad);
        if (edad>=18) {
            System.out.println("Es mayor de 18");
        } else  {
        System.out.println("Es menor de 18 años");



        }



        }
    }
