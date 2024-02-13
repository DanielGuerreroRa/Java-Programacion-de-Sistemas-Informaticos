import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Leer un numero hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduzca el numero -> ");
        numero = teclado.nextInt();
        while (numero != 0) {
            if (numero%2==0){
                System.out.println("Par ");
            }else {
                System.out.println("Impar ");
            }
            System.out.println("Introduzca otro numero -> ");
            numero= teclado.nextInt();

        }
    }
}
