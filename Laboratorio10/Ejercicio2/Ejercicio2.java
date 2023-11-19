package Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        Integer[] intArray = {0,1,2,3,4,5};
        String[] stringArray = {"Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete"};

        try{
            System.out.printf("Array integerArray contiene:%n");
            imprimirArray(intArray);
            System.out.printf("Se intercambia el elemento 3 y 5:%n");
            intArray = intercambiarPosicion(intArray, 3, 5);
            imprimirArray(intArray);

            System.out.printf("%nArray de cadenas contiene:%n");
            imprimirArray(stringArray);
            System.out.printf("Se intercambia el elemento 1 y 7:%n");
            stringArray = intercambiarPosicion(stringArray, 1, 7);
            imprimirArray(stringArray);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
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

    public static <T> T[] intercambiarPosicion(T[] inputArray, int a, int b) throws Exception{
        T temporal = inputArray[a];
        inputArray[a] = inputArray[b];
        inputArray[b] = temporal;
        return inputArray;
    }
}