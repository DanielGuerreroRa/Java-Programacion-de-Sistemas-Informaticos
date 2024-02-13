import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Pedir tres numero y mostrarlos ordenados de mayor a menor
        Scanner ordenNumero = new Scanner(System.in);
        int n1 = ordenNumero.nextInt();
        int n2 = ordenNumero.nextInt();
        int n3 = ordenNumero.nextInt();
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + "," + n2 + "," + n3);
        }else {
            if (n1 > n3 && n3 >n2){

            }



        }
    }
}
