import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
      Set<Integer> numeros = new HashSet<>();
      numeros.add(9);
      numeros.add(8);
      numeros.add(7);
      numeros.add(2);

        System.out.println(numeros);
        System.out.println("Esta vacia: " + numeros.isEmpty());
        System.out.println("Existe un 8: " + numeros.contains(8));
        System.out.println("Eliminiamos el 2: " + numeros.remove(2));
        System.out.println("Lista: " + numeros);

        //Recorrerla
        for (Object elemento: numeros){
            System.out.println(elemento);
        }

    }
}