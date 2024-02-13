public class bucleWhile_DoWhile {
    public static void main(String[] args) {
        //Bucle while
        int i = 100;
        while (i <= 10) {
            System.out.println("Entra en bucle -> " + i);
            i++;
        }
        System.out.println("Terminacion del bucle");

        //Comparativa con do-while.
        i = 100;
        do{
            System.out.println("Entra el bucle " + i);
            i++;
        }while (i<=10);

        System.out.println("Terminacion del bucle");

    }
}