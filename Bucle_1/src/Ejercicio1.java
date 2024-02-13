import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Sumar los numeros que se adquieren por la consola.
        //Salir del bucle cuando el numero sea negativo.
        Scanner teclado = new Scanner(System.in);
        int numero;
        int suma = 0;
        do {
            System.out.println("Para salir ponga negativo");
            numero = teclado.nextInt();
            if (numero >= 0) {
                suma += numero;}
            }while (numero >= 0) ;
            System.out.println("Suma -> " + suma);


        }
    }



