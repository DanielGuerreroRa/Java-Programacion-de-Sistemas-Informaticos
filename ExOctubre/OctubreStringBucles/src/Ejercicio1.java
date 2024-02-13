import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Pedir un numero N, y mostrar todos los numero del numero al N.
        //Declaracion de variables
        //Primitivas
        int numero = 0;
        //De instancia
        Scanner teclaco=new Scanner(System.in);
        //Pedir el numero por la consola y leerlo
        System.out.println("Escribe un numero -> ");
        numero = teclaco.nextInt();
        for (int i = 1; i<=numero; i++ ){
            System.out.println(i);

        }

    }
}
