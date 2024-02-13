import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        //Pedir dos numeros y decir su es multiplo del otro
        Scanner esMultiplo = new Scanner(System.in);
        int primerNumero = esMultiplo.nextInt();
        int segundoNumero = esMultiplo.nextInt();
        if (primerNumero%segundoNumero == 0) {
            System.out.println("Son multiplos");
        }else {
            System.out.println("No son multiplos");
        }
    }
}
