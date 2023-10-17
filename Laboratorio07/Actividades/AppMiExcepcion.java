public class AppMiExcepcion {
    public static void main(String[] args) {
        validaPropia(11);
    }

    public static void validaPropia(int n) {
        try {
            minimo(n);
            System.out.println(n + " es mayor a 10");
        }

        catch(MiExcepcion e) {
            System.out.println("No me sirve ese numero");
        }
    }

    public static void minimo(int numero) throws MiExcepcion {
        if(numero <= 10)
            throw new MiExcepcion("Necesito un numero mayor a 10");
    }
}
