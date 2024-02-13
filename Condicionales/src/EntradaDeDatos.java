import java.util.Scanner;

public class EntradaDeDatos {
    //Declaracion de variables - primitivas o instacia
    public static void main(String[] args) {
        int numero;
        Scanner tecladoEtrada = new Scanner(System.in);
        System.out.println("Escriba un numero -> ");
        numero = tecladoEtrada.nextInt();
        System.out.println("El numero que se leyo fue ->" + numero);
        //Recibiendo por consola el sueldo
        Double sueldo;
        System.out.println("Escriba el suelto ");
        sueldo = tecladoEtrada.nextDouble();
        System.out.println("El numero que se leyo fue -> " + sueldo);
    }
}
