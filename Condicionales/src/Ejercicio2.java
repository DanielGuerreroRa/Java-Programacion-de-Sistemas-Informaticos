import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Pedir el dia, mes  y año de una fecha e indica si la fecha es correcta. Suponiendo todos los meses de 30 dias.
        Scanner fecha = new Scanner(System.in);
        System.out.println("Poner la fecha ");
        int año = fecha.nextInt();
        int mes = fecha.nextInt();
        int dia = fecha.nextInt();
        if (año >= 1 && año <= 2023) {
            System.out.println("Año correcto ");
        } else {
            System.out.println("Año no correcto");
            if (mes >= 1 && mes <= 12) {
                System.out.println("Mes correcto ");
            } else{
                System.out.println("Mes no correcto ");
            }if (dia >= 1 && dia <= 30) {
                System.out.println("Dia correcto ");
            }else {
                    System.out.println("Dia no correcto");
                }

        }


    }
}