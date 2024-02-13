import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Mostrar la tabla de multiplicar del numero leido en cosola

        Scanner teclado = new Scanner(System.in);

        int tabla;

        //Solicitarlo por la consola
        System.out.println("Escriba el numero de la tabla a mostrar");
        tabla= teclado.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(tabla + " * " + i + " = "+ tabla*i );
        }

    }
}
