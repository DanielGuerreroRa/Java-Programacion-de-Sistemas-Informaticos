public class Ejercicio3 {
    public static void main(String[] args) {
        //Crear un bucle que pinte por consola todas las componentes de un array.
        //En orden inverso a como estan guardadas en la array.

        //Definir el array con los datos.
        int[] numeros = {5,4,7,9,8};
        //En un bucle recorrerlo (cambiar valor inicial, condicio, modificacion de la i).
        for (int i = numeros.length-1; i >= 0; i--){

            System.out.println("Numeros de la posicion " + i + " con valor " + numeros[i] );
        }



    }
}