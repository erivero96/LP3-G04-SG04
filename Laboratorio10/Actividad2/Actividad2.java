public class Actvidad2 {

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        T min = a;
        if (b.compareTo(min) < 0) {
            min = b;
        }
        if (c.compareTo(min) < 0) {
            min = c;
        }
        if (d.compareTo(min) < 0) {
            min = d;
        }
        return min;
    }

    public static void main(String[] args) {
        Integer a = 5, b = 3, c = 7, d = 1;
        System.out.println(minimo(d, b, c, a)); // Output: 1

        Double e = 3.5, f = 2.1, g = 4.7, h = 1.0;
        System.out.println(minimo(e, f, g, h)); // Output: 1.0

        String i = "hola", j = "adios", k = "mundo", l = "java";
        System.out.println(minimo(i, j, k, l)); // Output: adios

        Persona m = new Persona("Juan", 25), n = new Persona("Ana", 30), o = new Persona("Pedro", 20), p = new Persona("Luis", 35);
        System.out.println(minimo(p, n, o, m)); // Output: Ana
    }
}

