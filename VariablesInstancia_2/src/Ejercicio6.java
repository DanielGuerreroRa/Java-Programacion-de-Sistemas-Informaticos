import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //Pedir dos numeros y decir cual es mayor
        Scanner numeroMayor = new Scanner(System.in);
        int primerNumero = numeroMayor.nextInt();
        int segungoNumero = numeroMayor.nextInt();
        if (primerNumero > segungoNumero) {

                System.out.println("Es mayor");
            }    else {
            System.out.println("Es menor");
        }
    }
}