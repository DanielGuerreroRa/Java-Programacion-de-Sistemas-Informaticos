import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        //Mostrar las 10 tablas de multiplicar

        Scanner teclado = new Scanner(System.in);


        for (int a = 1; a <= 10; a++) {
            //Solicitarlo por la consola
            System.out.println("Tabla del " + a);

            for (int i = 1; i <= 10; i++) {
                System.out.println(a + " * " + i + " = " + a * i);
            }

        }
    }
}
