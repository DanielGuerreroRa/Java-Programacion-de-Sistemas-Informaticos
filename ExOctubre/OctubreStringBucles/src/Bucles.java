import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);
        System.out.println("Escriba un numero");
        numero = teclado.nextInt();
        System.out.println("numero leido" + numero);

        //Equivalente en un bucle
        for (int contadorIteracciones = 0; contadorIteracciones < 3; contadorIteracciones++) {
            System.out.println("Escriba un numero");
            numero = teclado.nextInt();
            System.out.println("numero leido" + numero);
        }
        for (int i = 1; i<=10; i++){
            System.out.println(i);


        }


    }
}

