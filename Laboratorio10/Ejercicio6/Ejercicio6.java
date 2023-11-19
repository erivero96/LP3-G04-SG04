import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 23);
        Persona p2 = new Persona("Pedro", 30);
        Persona p3 = new Persona("Ana", 20);
        Persona[] personas = {p1, p2, p3};

        Persona p4 = new Persona("Lucas", 20);
        Persona p5 = new Persona("Jose", 25);
        Persona[] personas2 = {p4, p5, p1, p2, p3};

        Persona[] personas3 = copyArray(personas, personas2);
        for (Persona persona : personas3) {
            System.out.println(persona.getNombre() + " " + persona.getEdad());
        }

        String[] strings = {"hola", "mundo", "chau"};
        String[] strings2 = {"hola", "mundo", "chau", "adios mundo"};
        String[] strings3 = copyArray(strings, strings2);
        for (String string : strings3) {
            System.out.println(string);
        }

        Producto producto1 = new Producto("001", "Producto 1", 100);
        Producto producto2 = new Producto("002", "Producto 2", 200);
        Producto producto3 = new Producto("003", "Producto 3", 300);
        Producto[] productos = {producto1, producto2, producto3};

        Producto producto4 = new Producto("001", "Producto 1", 100);
        Producto producto5 = new Producto("002", "Producto 2", 200);
        Producto producto6 = new Producto("003", "Producto 3", 300);
        Producto[] productos2 = {producto4, producto5, producto6, producto1};

        Producto[] productos3 = copyArray(productos, productos2);
        for (Producto producto : productos3) {
            System.out.println(producto.getCodigo() + " " + producto.getCodigo() + " " + producto.getPrecio());
        }
    }

    public static  <T> T[] copyArray(T[] array1, T[] array2) {
        ArrayList<T> list = new ArrayList<T>(); //Usamos arrayList para no tener que preocuparnos por el tamaño del array

        for (T element : array1) {
            list.add(element);
        }

        for(T element : array2) {
            if(!list.contains(element)) {
                list.add(element);
            }
        }
        return list.toArray(array1); //Convertimos el arrayList a array
    }
}
