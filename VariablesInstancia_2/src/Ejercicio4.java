import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Pedir un numero y decir si es par o impar
        Scanner Numero = new Scanner(System.in);
        int valorNumero = Numero.nextInt();
        if (valorNumero == 2) {
            System.out.println("Es Par");
        }else {
            System.out.println("Es Impar");
        }


        }
    }
