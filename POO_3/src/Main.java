import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedir un número de edad y ver si es mayor de edad.
        Scanner teclado = new Scanner(System.in);
        System.out.println("La edad es: ");
        int edad = teclado.nextInt();

        if (edad < 18) {
            System.out.println("No tiene edad para conducir");
        } else {
            System.out.println("Tiene edad para conducir");
        }
        //Pedir el ingreso y el número de hijos, dar la ayuda si el ingreso es menor  a 19.000 y tiene 2 hijos o mas.
        System.out.println("El ingreso es: ");
        float ingreso = teclado.nextFloat();
        System.out.println("Cuantos hijos tiene:");
        int hijos = teclado.nextInt();
        if (ingreso < 19_000 && hijos >= 2) {
            System.out.println("No recibe la ayuda");
        } else System.out.println("Recibe la ayuda");

        //Si el ingreso anual es menos a 20.000 y no tiene vivieda el impuesto es 18% y si no 15%.
        System.out.println("El igreso es: ");

        boolean tieneVivienda;
        System.out.println("Su ingreso");
        ingreso = teclado.nextFloat();
        System.out.println("Tiene vivienda? true - false");
        tieneVivienda = teclado.nextBoolean();
        if (ingreso < 20_000 && tieneVivienda) {
            System.out.println("Su impuesto es del 18% " + ingreso * 1.18 + " €");
        } else {
            System.out.println("Su impuesto es del 15% " + ingreso * 1.15 + " €");
        }
        //Pedir un número del 1 al 7 y decir que dia de la semana es.
        int dia;
        System.out.println("Que dia es: ");
        dia = teclado.nextInt();
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        //Hasta 2 años  Exento - de 2 a 5 años anual - mas de 5 años semestral.
        float años;
        System.out.println("Cuantos años tiene el vehiculo: ");
        años = teclado.nextFloat();
        if (años < 2){
            System.out.println("Exento");
        } else if (años >= 2 && años <= 5) {
            System.out.println("Anual");
        } else if (años > 5) {
            System.out.println("Semestral");
        }
    }
}
