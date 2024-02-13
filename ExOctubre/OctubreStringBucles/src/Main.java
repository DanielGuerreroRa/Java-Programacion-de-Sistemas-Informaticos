public class Main {
    public static void main(String[] args) {
        String nombre = "Manolo";
        System.out.println(nombre.toLowerCase()); //todo en minuscula
        System.out.println(nombre.toUpperCase()); //todo en mayusculas
        System.out.println(nombre); //tal cual esta escrito
        System.out.println(nombre.isEmpty()); //falso
        System.out.println(nombre.indexOf("M"));// Posicion de la letra sobre el nombre
        System.out.println(nombre.lastIndexOf("a")); // Posicion de la letra sobre el nombre empezado desde el final
        System.out.println(nombre.substring(3)); //La continuidad de la palabra desde la posicion de la letra indicada
        System.out.println(nombre.substring(2,4));//Coge la parte de la palabra seleccionada enre la posiciones de los numeros
        System.out.println(nombre.length());//Cantidad de caracteres que contiene la palabra

        //Ejercicio
        //Dada la cuenta bancaria 1234567890123456789
        String numeroBancario = "1234567890123456789";
        //Se pide extraer los primeros dos digitos
        System.out.println(numeroBancario.substring(0,2));
        //Se pide extraer los 10 ultimos
        System.out.println(numeroBancario.substring(9));
        //Se pide extraer de la posicion 4 a la 9
        System.out.println(numeroBancario.substring(4,10));

         /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.

        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • ej* Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */
       String texto = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(texto.substring(0,5));
        //ej*
        System.out.println(texto.substring(16,21));
        //Sacar porsicion de mosca
        int posicionInicial = texto.indexOf("mosca");
        System.out.println(posicionInicial);
        System.out.println("mosca".length());
        System.out.println("("+ texto.substring(posicionInicial,posicionInicial+"mosca".length())+")");

        System.out.println(texto.substring(31,37));
        System.out.println(texto.indexOf("m"));
        System.out.println(texto.length());







    }
}