// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Variables");

        // nombre de variables y metodos en nomenclatura camello
        /*este es otro comentario
         */
        byte numeroHermano = 12;
        short cantidadCorta = 350;
        int numeroClientes = 1_234_234;
        long numeroLargo = 1_234_456_123L;
        System.out.println(numeroHermano);
        System.out.println(cantidadCorta);
        System.out.println(numeroClientes);
        System.out.println(numeroLargo);

       //Numeros con decimales
        float numerocondecimales = 5.5F;
        double numeroConDecimal = 123_123_123.123;

        System.out.println(numerocondecimales);
        System.out.println(numeroConDecimal);

        boolean estaCasado = false;
        System.out.println(estaCasado);
        char letra = 'a';
        System.out.println(letra);
        //Calcular el area de un cuadrado cuyo lado mide 6
        byte lado = 6;
        int areaCuadrado = lado * lado;
        System.out.println(lado * lado);

        //Calcular el area de un circulo cuyo radio mide 3
        double radio = 3;
        double areaCirculo = radio * radio * 3.1416;
        System.out.println(areaCirculo);

        //Calcular el perimetro de un rectagulo cuba base es 4 y la altura 3
        int base = 4;
        int altura = 3;
        int perimetroCuadrado = 2*base + 2*altura;
        System.out.println(perimetroCuadrado);
        /*
        Operadores aritmeticos
        +, -, *, /, %
        */
        System.out.println(10%3);
        /*Operadores de comparacion
        >, <, >=, <=, ==, !=
        */
        int num1=15, num2=7;
        System.out.println(num1!=num2);

        //Oferta -> si compras mas de 5 unidades se da el 10% de descuento
        //Decir si se compra 4 unidades si se obtiene el descuento
        //Defiir una variable para las unidades
        //Hacer la comparacion
        int unidades = 4;
        System.out.println(unidades>5);

        //Oferta -> si compras un importe de mas de 100 euros se da eñ 5% de descuento
        //Se compraron 3 unidades de 15 euros
        //¿Le corresponde el descuento?
        byte unidadess = 3;
        float precio = 15F;
        System.out.println(unidadess*precio>100);



        }
    }
