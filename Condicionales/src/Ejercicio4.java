import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Pedir el dia, mes y año de una fecha correcta y mostrar la fecha del dia siguiente. Todos los meses 30.
        Scanner tecladoEntrada = new Scanner(System.in);
        int dia, mes, anio;
        int masUnDia = 1;
        System.out.println("Escriba el día");
        dia = tecladoEntrada.nextInt();
        System.out.println("Escriba el mes");
        mes = tecladoEntrada.nextInt();
        System.out.println("Escriba el año");
        anio = tecladoEntrada.nextInt();
        switch (dia){
            case 1:
                if (dia <=30 + masUnDia) {
                    System.out.println("Al dia siguiente ");
                }else if (dia>=30 && mes >=12+masUnDia){


                }
        }
    }
}
