public class App {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','O','L','A'};
        Persona2[] arregloPersona = {new Persona2("12345678", "Juan", "Lima"), new Persona2("87654321", "Ana", "Arequipa")};
        Boolean[] arregloBoolean = {true, false, true, false};
        Float[] arregloFloat = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);

        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);

        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.printf("%nArray arregloPersona contiene:%n");
        imprimirArray(arregloPersona);

        System.out.printf("%nArray arregloBoolean contiene:%n");
        imprimirArray(arregloBoolean);
        
        System.out.printf("%nArray arregloFloat contiene:%n");
        imprimirArray(arregloFloat);
    }


    public static void imprimirArray(Integer[] arreglo) {
            for(Integer elemento : arreglo){
                System.out.printf("%s", elemento);
            }
            System.out.println();
    }

    public static void imprimirArray(Double[] arreglo) {
        for(Double elemento : arreglo){
            System.out.printf("%s", elemento);
        }
        System.out.println();
    }

    public static void imprimirArray(Character[] arreglo) {
        for(Character elemento : arreglo){
            System.out.printf("%s", elemento);
        }
        System.out.println();
    }

    public static <T> void imprimirArray(T[] arreglo) {
        for(T elemento : arreglo){
            System.out.printf("%s", elemento);
        }
        System.out.println();
    }

}
