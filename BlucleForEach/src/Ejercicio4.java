public class Ejercicio4 {
    public static void main(String[] args) {
        //Crear un bucle de codigo que recorra los siguiente arrays y me cree otro que contenga lo componentes siguientes:
        //int[] array1 = {1,2,3,4,5};
        //int[] array2 = {334,23,4};
        //El array resultado es el siguiente:
        //int[] array3 = {1,2,3,4,5,334,23,4};

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {334, 23, 4};
        int[] array3 = new int [array1.length+array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }for (int i = 0; i < array2.length; i++){
            array3[array1.length+i]=array2[i];

        }for (int i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }



        }
    }



