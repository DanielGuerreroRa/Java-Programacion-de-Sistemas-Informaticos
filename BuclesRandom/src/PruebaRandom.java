import java.util.Random;

public class PruebaRandom {
    public static void main(String[] args) {
        //Variable instancia
        Random numeroAleatorio = new Random();
        //Mostrar un numero aleatorio
        System.out.println(numeroAleatorio.nextInt());
        System.out.println(numeroAleatorio.nextInt(10));
        System.out.println(numeroAleatorio.nextInt(1,100));

    }

}
