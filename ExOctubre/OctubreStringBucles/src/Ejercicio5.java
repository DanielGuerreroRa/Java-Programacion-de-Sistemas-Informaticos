import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
//5.	Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.ç
    //Declaracion de variables
        //Primitivas
        int numero, numerosPositivos=0, numerosNegativos=0, sumaPositivos=0, sumaNegativos=0, cantidadCeros=0;
        //Instancia
        Scanner teclado=new Scanner(System.in);
        for (int i=1;i<=10;i++){
            System.out.println("Escriba el numero " +i );
            numero= teclado.nextInt();
            if (numero>0){
                numerosPositivos++;
                sumaPositivos=sumaPositivos+numero;

            }
            else if (numero<0){
                sumaNegativos+=numero;
                numerosNegativos++;
            }
            else {
                //Si entra aqui es que es negativo

                cantidadCeros++;

            }

        }
        System.out.println("Media de positivos " + (sumaPositivos/sumaPositivos));
        System.out.println("Media de negativos " + (sumaNegativos/numerosNegativos));
        System.out.println("Cantidad de ceros " + cantidadCeros);


        }
    }

