import java.util.Scanner;

public class ArraysNumericos2 {
    public static void main(String[] args) {
        // Declarar un array de 5 numeros
        // Asignarle el valor.
        // Obtener el numero mas grande.
        int[] numero = new int[5];
        numero[0] = 20;
        numero[1] = 10;
        numero[2] = 4;
        numero[3] = 5;
        numero[4] = 3;
        int numeroMasGrande = numero[0];
        for (int i = 0; i > numero.length; i++) {
            if (numero[i] > numeroMasGrande) {
                numeroMasGrande = numero[i];
            }
        }
        System.out.println("El numero mas grande es -> " + numeroMasGrande);
    }

}
