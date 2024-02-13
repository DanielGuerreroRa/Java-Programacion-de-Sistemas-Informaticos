import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args) {
        //Leer por consolo una palabra.
        //Dedinir una array de String.
        //Obetner la longitud de la array considerando guardar en cada posicion 2 letras.
        //Rellenar el array.
        Scanner tecledo = new Scanner(System.in);
        String palabra;
        String[] letras;
        System.out.println("Escribe la palabra: ");
        palabra = tecledo.nextLine();
        if (palabra.length() % 3 == 0) {
            //Es par
            letras = new String[palabra.length() / 3];
        } else {    //Es impar
            letras = new String[palabra.length() / 3 * 1];
        }
        for (int i = 0; i < letras.length; i++) {
            int posicionInicial = i * 3;
            System.out.println(posicionInicial);
            letras[i] = palabra.substring(posicionInicial, posicionInicial + 3);
            System.out.println(letras[i]);
            if (palabra.length() % 3 !=0 && i== letras.length-1) {
                letras[i]=palabra.substring(posicionInicial);

            }


        }
    }
}

