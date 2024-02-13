import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Definir arra de char
    char[] letras = new char[5];
    Scanner teclado =new Scanner(System.in);
    for(int i = 0; i < letras.length; i++){
        System.out.println("Esciba una letra -> ");
        letras[i]=teclado.next().charAt(0);


    }
    //Mostrar los datos almacenados del array
    for (int i = 0; i < letras.length; i++){
        System.out.println(letras[i]);

    }

    }
}