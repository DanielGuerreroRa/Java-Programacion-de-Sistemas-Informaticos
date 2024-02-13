import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
//3.	Pedir 5 números y escribir la suma total
        //Definicion variable
        //Instancia
        Scanner teclado= new Scanner(System.in);
        //Primitivas
        int numero = 0;
        int suma= 0;
        for (int i=1; i<=5; i++){
            System.out.println("Escriba el numero -> ");
            numero = teclado.nextInt();
            suma= suma+numero;
            System.out.println("La suma total es = " + suma);


        }
    }
}
