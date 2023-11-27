public class Main2 {
    public static void main(String[] args) {
        Pair<String, String> pair = new OrderedPair<String, String>("Lima", "Lima");
        System.out.println(pair);

        Pair<Integer, String> pair1 = new OrderedPair<Integer, String>(1, "Lima");
        System.out.println(pair1);

        Pair<Integer, Integer> pair2 = new OrderedPair<Integer, Integer>(1, 1);
        System.out.println(pair2);

        Pair<String, Persona1> pair3 = new OrderedPair<String, Persona1>("Lima", new Persona1("Juan", "Lima", "123456789"));
        System.out.println(pair3);
    }
}


class Persona1 {
    private String nombre;
    private String direccion;
    private String dni;

    public Persona1(String nombre, String direccion, String dni) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
