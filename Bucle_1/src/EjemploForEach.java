import java.util.Scanner;

public class EjemploForEach {
    public static void main(String[] args) {
        int[]numero={3,4,1,5,6,7};
        //Recorrer la conexion.
        for (int elemento:numero){
            System.out.println(elemento);

        }
        String[] palabras= {"casa","coche","aula","ordenador"};
        //Recorrer el array y mostrarlo en consola
        for (String elemento:palabras){
            System.out.println(elemento);
        }
        char[] letras={'d','a','n','i'};
        for (char elemento:letras){
            System.out.println(elemento);
        }
        double[] sueldos={1500,1025.30,835.23,1200.60};
        double suma=0;
        for (double elementos:sueldos){
            suma+=elementos;
        }
        System.out.println("La suma es -> " + suma);

        }
    }

