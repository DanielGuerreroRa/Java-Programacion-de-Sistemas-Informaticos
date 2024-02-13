import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner tecladoEntrada = new Scanner(System.in);
        System.out.println("Escriba su edad");
        int edad = 0;
        edad = tecladoEntrada.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }

    }
}