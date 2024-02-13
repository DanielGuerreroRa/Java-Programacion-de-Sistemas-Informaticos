import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Pedir numeros hasta que se teclee uno negativo y mostrar cuantos se han itroducido.
        Scanner teclado=new Scanner(System.in);
        int numeros = 0;
        int contador=0;
        System.out.println("El numero ");
        numeros= teclado.nextInt();

        while (numeros>0){
            contador++;
            System.out.printf("El numero ");
            numeros = teclado.nextInt();

            System.out.println("Numeros ingresados " + contador);

            }
            }

        }




