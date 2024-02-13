public class CondicionalSwitch {
    public static void main(String[] args) {
        char estadoCivil = 'S';
        switch (estadoCivil){
            case 'C':
            case 'c':
                System.out.println("Casado ");
                break;
            case 'D':
            case 'd':
                System.out.println("Divorciado ");
                break;
            case 'S':
            case 's':
                System.out.println("Soltero ");
                break;
            case 'V':
            case 'v':
                System.out.println("Viudo ");
                break;
            default:
                System.out.println("El valor es invalido");

        }
    }
}
