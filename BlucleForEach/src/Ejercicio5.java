public class Ejercicio5 {
    public static void main(String[] args) {
        //Ejercicio 7
        //Dado el siguiente array crear un bloque de código que sume todas las componentes del array.
        //Para ello hacer uso de un bucle que vaya obteniendo todos los valores del array.
        //float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
        float[] decimales = {3.4F,5.67F,12.0F,3.141615F,0.0F};
        float total=0F;
        for (int i = 0; i < decimales.length; i++){
            total=total+decimales[i];

        }
        System.out.println("El total es " + total);



    }
}
