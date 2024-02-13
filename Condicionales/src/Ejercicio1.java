import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Pedir una nota de 0 al 10 y mostrarla e forma:Insuficiente, Suficiente, Bien.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno");
        int nota = teclado.nextInt();
        if (nota <= 7)
        {
            System.out.println("Bien ");
        }else if (nota<=5 && nota<=7) {
            System.out.println("Suficiente");

        }else if (nota<=4){
            System.out.println("Insuficiente ");
        }



        }
    }

