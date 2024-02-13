// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Pepito {
    public static void main(String[] args) {
        //Declarar variable e incremntarla
        int numero = 0;
        //Esta es igual a
        numero = numero + 1;
        System.out.println(numero);
        //esta
        numero += 1;
        System.out.println(numero);
        //Solo es valido con valor de 1 si quieres sumar mas poner la cantidad del numero como en el ejemplo anterior
        numero++;
        System.out.println(numero);
        int numero2 = 100;
        numero2 = numero2 - 5;
        numero2 -= 5;
        numero2--;
        System.out.println("numero2 -> " + numero2);

        //Declarar variable y decremetar
        int numero3 = 7;
        numero3 = numero3 * 3;
        System.out.println("numero3 -> " + numero3);
        numero3 *= 2;
        System.out.println("numero3 ->" + numero3);

        //Division - dividir entre 10 y luego entre 5
        int numero4 = 100;
        numero4 = numero4 / 10; // esta es la forma larga
        System.out.println("numero4 ->" + numero4);
        numero4 /= 5; //esta es la forma corta
        System.out.println("numero4 ->" + numero4);


        /*Declarar una variale con el nombre numero5 asignar un valor de 8
        Otener el resto de dividirlo entre 3
         */
        int numero5 = 8;
        numero5 %= 3;
        System.out.println("numero5 ->" + numero5);

        //Caso de asignar valores
        int num1 = 10, num2 = 2, num3 = 0;
        num3 = num1 + num2++; //Post-Incremento
        num3 = num1 + ++num2; //Pre-Incremento
        System.out.println(num3);

        //Operaciones de comparacion
        //Declarar una variable en el valor de 10 y decir si es par
        int valor = 10;
        System.out.println(valor % 2 == 0);

        //Declarar una variable en el valor de 10 si es multiplo de 3
        int valor2 = 10;
        System.out.println(valor % 3 == 3);

        //Declarar una variable y asignarle el numero -5
        //Decir si es negativo
        int valor3 = -5;
        System.out.println(valor3 < 0);
        //Decir si es positivo
        int valor4 = -5;
        System.out.println(valor4 > 0);

        //Declaremos una variable importe con valor 50
        //Si importe es mayor o igual a 100 calcular el 100% de descuento
        //Pero si el imporrte es menor calcular el 3%
        float importe = 50F;
        if (importe >= 100) {
            System.out.println("Entra al if");
            System.out.println(importe * 0.10);

        } else {
            System.out.println("Entra al else"); //En este caso entra a Else porque es menor de 100
            System.out.println(importe * 0.03);
        }
        //Declarar una variable de un numero de hijos
        //Decir si es familia numerosa o NO es familia numerosa
        byte numeroHijos = 1;
        if (numeroHijos >= 3) {
            System.out.println("FamiliaNuemrosa");
        } else {
            System.out.println("FamiliaNoNumerosa");
        }
        //Una variable que guarde la edad
        //Decir si es mayor o menor de edad
        int edad = 16;
        if (edad >= 18) {
            System.out.println("MayorEdad");
        } else {
            System.out.println("MenorEdad");

            //Declarar una variable para el numero de mes
            //Decir los dias de cada mes
            byte mes = 4;
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                System.out.println("El mes tiene 31 dias");
            } else {
                System.out.println("El mes tiene 30 dias");

                //Si el numero esta entre 5 y 15 mostrar que te has ganado un ordenador
                int valorNumerico = 8;
                if (valorNumerico >= 5 && valorNumerico <= 15) {
                    System.out.println("Usted se a ganado un ordenador");

                }

            }


        }
    }
}