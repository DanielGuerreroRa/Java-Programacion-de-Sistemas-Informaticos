import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 5;
        numeros[1] = 6;
        numeros[2] = 7;
        numeros[3] = 10;
        numeros[4] = 3;
        System.out.println(numeros[0]);
        //Bucles
        System.out.println("Aqui empieza el bucle");
        for (int a = 0; a < 5; a++) {
            System.out.println(numeros[a]);
            //Ejemplo de como ponerlo tambien el 5 por numeros.length (numero total de vectores).
            for (int b = 0; b < numeros.length; b++) {
                System.out.println(numeros[b]);
            }
            // Definir un Array de String.
            // De 7 posiciones.
            String[] nombre = new String[7];
            nombre[0] = "Francisco";
            nombre[1] = "Beatriz";
            nombre[2] = "Jose";
            nombre[3] = "Cristina";
            nombre[4] = "Petkova";
            nombre[5] = "Jhonatan";
            nombre[6] = "Daniel";

            // Metodos StartWith comienza // EndsWith termina

            //Realiza un bucle para contar los nombre que comienzan con D.
            int contador = 0;
            for (int i = 0; i < nombre.length; i++) {
                System.out.println(nombre[i].startsWith("D"));
                if (nombre[i].startsWith("D")) {
                    contador++;
                }
            }
            System.out.println("Hay " + contador + " nombre que comienzan por D");


            // Declarar un array de 5 posiciones tipo char y hay que leerlo por la consola (Scanner)
            // Usando el metodo next() de Scanner y el metodo charAt() del String.
            Scanner teclado = new Scanner(System.in);
            teclado.next();
            char[] letra = new char[5];
            for (int i = 0; i < 5; i++) {
                System.out.println("Escribe la letra -> ");
                String palabra = teclado.next();
                letra[i] = palabra.charAt(0);
                System.out.println(letra[i]);


            }for (int i =0; i< letra.length; i++){
                System.out.println(letra[i]);
            }


        }
    }
}










