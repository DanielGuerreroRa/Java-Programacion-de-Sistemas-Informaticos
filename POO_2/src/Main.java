import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        char letra = 'A';
        boolean bandera=true;
        long numero =80000000L;
        float numeroDecimales= 9.5F;

        int[] numeros = new int[5];
        for (int i =0; i < numeros.length ; i++){
            numeros[i]=(i+1)*5;
        }
        for (int elemeto : numeros){
            System.out.println(elemeto);

        }
        //Leer por la consola una palabra.
        //Guardar cada letra en una posicion de una array de chars.
        //Recomendación se puede usar metodo charAt().

        //1.Definir Variable
        Scanner teclado=new Scanner(System.in);
        String palabra;
        char[] letras;
        //2.Estructura
        //Leer la palabra
        System.out.println("Escribe la palabra: ");
        palabra=teclado.nextLine();
        letras =new char[palabra.length()];
        //Bucles
        for (int i = 0; i < letras.length; i++){
            letras[i]=palabra.charAt(i);
            System.out.println(letras[i]);
        }


    }
}