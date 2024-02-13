public class Ejercicio4 {
    public static void main(String[] args) {
//4.	Diseñar un programa que muestre el producto de los 10 primeros números impares
        // Declarar las variables
        //Primitivas
        int producto =1;
        for (int i = 1; i<= 19; i+=2){
            System.out.println(i);
            producto*=i;
            System.out.println("Producto ->"+ producto);


        }


    }
}
