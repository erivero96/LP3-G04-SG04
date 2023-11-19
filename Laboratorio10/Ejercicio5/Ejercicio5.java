public class Ejercicio5 {

    public static void main(String[] args) {
        Integer[] arreglo = {1, 2, 3, 4, 5};
        Integer elemento = 3;
        System.out.println(buscarElemento(arreglo, elemento)); // 2

        Double[] arreglo2 = {1.5, 2.5, 3.5, 4.5, 5.5};
        Double elemento2 = 4.5;
        System.out.println(buscarElemento(arreglo2, elemento2)); // 3

        String[] arreglo3 = {"hola", "mundo", "java"};
        String elemento3 = "java";
        System.out.println(buscarElemento(arreglo3, elemento3)); //Error de compilación

        Producto[] productos = new Producto[3];
        productos[0] = new Producto("001", "Producto 1", 100);
        productos[1] = new Producto("002", "Producto 2", 200);
        productos[2] = new Producto("003", "Producto 1", 100);
        
        Producto producto = new Producto("003", "Producto 1", 100);

        System.out.println("El elemento se encuentra en la posición: " + buscarElemento(productos, producto)); //Error de compilación
    }

    public static <T extends Number & Comparable<T>> int buscarElemento(T[] arreglo, T elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (elemento.compareTo(arreglo[i]) == 0) {
                return i;
            }
        }
        return -1;
    }
}
