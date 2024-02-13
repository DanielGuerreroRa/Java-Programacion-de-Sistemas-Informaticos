public class ArraysNumericos {
    public static void main(String[] args) {
        // Declarar un array de 5 numeros
        // Asignarle el valor.
        // Obtener el numero mas pequeño.
        int[] numero = new  int[5];
        numero[0]=20;
        numero[1]=10;
        numero[2]=30;
        numero[3]=50;
        numero[4]=40;
        int numeroMasPequeno = numero[0];
        for (int i = 0; i < numero.length; i++){
            if (numero[i]<numeroMasPequeno){
                numeroMasPequeno = numero[i];
            }
        }
        System.out.println("El numero mas pequeno es -> " + numeroMasPequeno);
    }
}
