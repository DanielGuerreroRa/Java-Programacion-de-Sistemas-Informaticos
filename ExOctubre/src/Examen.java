import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {


        // 1. Crear un proyecto en IntelliJ con el nombre OctubreExamen.
        // 2. Crear el repositorio en Git Hub.
        // 3. Hay que declarar tres variables, una entera con el nombre edad=18.
        // 3. Otra double con el nombre sueldo=1200 y otra char con el nombre sexo=M, mostrar en consola.
        int edad = 18;
        double sueldo = 1_200;
        char sexo = 'M';
        System.out.println("La edad es " + edad);
        System.out.println("El suelda es " + sueldo);
        System.out.println("El sexo es " + sexo);

        // 4. Definir dos variables, la primera de apellido con valor "Ruiz", la otra boolean con valor verdadero. Mostrar C.
        String apellido = "Ruiz";
        boolean verdadero;
        verdadero = true;
        System.out.println("El apellido " + apellido);
        System.out.println("el valor es " + verdadero);

        // 5. Definir una variable numerica para guardar la hora de 0 a 24.
        // 5. Escribir en la consola Buenos dias si la hora esta entre 0-12, y el resto buenas noches.
        int hora = 16;
        System.out.println("¿Que hora es? " + hora);
        if (hora <= 12) {
            System.out.println("Buenos días");
        } else {
            System.out.println("Buenas noches");

        // 6. Solicitar por consola el precio de un producto y mostralo en la consola.
        // 6. Definir una variable de tipo double con el nombre precio.
            Scanner teclado = new Scanner(System.in);
            double precio;
            System.out.println("Escribe el precio -> ");
            precio = teclado.nextDouble();

        // 7. Mostrar en la consola del 0 al 10.
            System.out.println("Mostrar numeros de 10 al 0 ");
            for (int i =10; i >=10; i--) {
                System.out.println(i);

        // 8. Solicitar por consola el DNI, nombre y direccion, mostrar en la cosola el siguiente texto:
        //    nombre: xxxxxx con DNI: xxxxx y vive en xxxxx.
               Scanner tecladoEntrada =new Scanner(System.in) ;
               String nombre, DNI, direccion;

                System.out.println("Escriba el nombre ");
                nombre=tecladoEntrada.next();
                System.out.println("Escriba el DNI ");
                DNI= teclado.next();
                System.out.println("Escriba el dirección ");
                direccion= teclado.next();
                System.out.println("El nombre: " + nombre + ". El DNI es: " + DNI + ". La direccion es: " + direccion);




            }


        }
    }
}
