import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //6.	Pedir 3 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.
        int sueldo, suma=0, mayoresDe1000=0;
        Scanner teclado=new Scanner(System.in);

        for (int i=1;i <=3; i++){
            System.out.println("El sueldo es -> " + i);
            sueldo= teclado.nextInt();
            suma+=sueldo;

            if (sueldo>1000){
                mayoresDe1000++;

         }

        }
        System.out.println("Cantidad de sueldos" + suma);
        System.out.println("Cantidad de sueltos mayores a 1000" + mayoresDe1000);
    }
}
