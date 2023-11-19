
public class Ejercicio3{
    public static <T, U> boolean isEqualTo(T a, U b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(isEqualTo(obj1, obj2)); // false

        Integer int1 = 5;
        Integer int2 = 7;
        System.out.println(isEqualTo(int1, int2)); // true

        Double double1 = 3.14;
        Double double2 = 3.14;
        System.out.println(isEqualTo(double1, double2)); // true

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(isEqualTo(str1, str2)); // false

        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Pedro", 30);
        System.out.println(isEqualTo(p1, p2)); // false

        Persona p3 = new Persona("Ana", 20);
        Persona p4 = new Persona("Ana", 20);
        System.out.println(isEqualTo(p3, p4)); // true
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Persona) {
            Persona p = (Persona) obj;
            return nombre.equals(p.getNombre()) && edad == p.getEdad();
        }
        return false;
    }
}




