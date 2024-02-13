import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            //Ejercicio.
            //1. Leer un numero y mostrar si cuadrado, repetir el proceso hasta que se introduzca un numer negativo.
            //Declarar variable
            int numero = 0;
            Scanner teclado = new Scanner(System.in);
            while (numero >= 0) {
                //Solicitar el numero
                System.out.println("Escriba un numero y cuando quiera salir escriba un negativo");
                numero = teclado.nextInt();
                if (numero >= 0) {
                    System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
                    System.out.println("el cuadrado de " + numero + " es " + Math.pow(numero, 2));
                } else {
                    System.out.println("Gracias");
             //Segunda opcion
                    while (true) {
                        //Solicitar el numero
                        System.out.println("Escriba un numero y cuando quiera salir escriba un negativo");
                        numero = teclado.nextInt();
                        if (numero >= 0) {
                            System.out.println("El cuadrado de " + numero + " es " + (numero * numero));
                            System.out.println("el cuadrado de " + numero + " es " + Math.pow(numero, 2));
                        } else {
                            System.out.println("Gracias");
                            break;

                        }
                    }
                }
            } //continue
            System.out.println("Impares");
            i = 0;
            while (i<= 9){
                i++;

                if (i%2==0){
                    continue;
                }
                System.out.println(i);

            }
        }

    }
}


