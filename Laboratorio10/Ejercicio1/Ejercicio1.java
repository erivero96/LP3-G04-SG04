package Ejercicio1;

public class Ejercicio1{
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'O', 'L', 'A'};
        Float[] floatArray = {5.1f, 4.2f, 3.3f, 2.4f, 1.5f};
        Boolean[] boolArray = {true, false, true, true};

        Persona p1 = new Persona("Matias", 72080726, "Selva Alegre");
        Persona p2 = new Persona("Pepito", 12345678, "Cayma");
        Persona p3 = new Persona("Carmen", 87654321, "Yanahuara");
        Persona[] personaArray = {p1, p2, p3};

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray boolArray contiene:%n");
        imprimirArray(boolArray);
        System.out.printf("%nArray personaArray contiene:%n");
        imprimirArray(personaArray);

        String[] stringArray = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        System.out.printf("%nArray de cadenas contiene:%n");
        imprimirArray(stringArray);
    }

    public static <T> void imprimirArray(T[] inputArray){
        for(T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }

    public static void imprimirArray(String[] inputArray){
        int num = 0;
        for(String elemento : inputArray){
            System.out.printf("%-10s ", elemento);
            num++;
            if(num == 4){
                System.out.println();
                num = 0;
            }
        }
        System.out.println();

    }
}