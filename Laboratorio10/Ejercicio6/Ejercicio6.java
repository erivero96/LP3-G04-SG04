import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {6, 7, 8, 9, 10};
        Integer[] array3 = copyArray(array1, array2);
        for (Integer element : array3) {
            System.out.println(element);
        }
    }
    
    public static  <T> T[] copyArray(T[] array1, T[] array2) {
        ArrayList<T> list = new ArrayList<T>();

        for (T element : array1) {
            list.add(element);
        }

        for(T element : array2) {
            if(!list.contains(element)) {
                list.add(element);
            }
        }
        return list.toArray(array1);
    }
}
