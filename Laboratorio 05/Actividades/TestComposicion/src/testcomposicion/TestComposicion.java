package testcomposicion;
public class TestComposicion {
    public static void main(String[] args) {
        Persona p1 = new Persona(12345, "Nombre1", "Apellido1", 12345);
        Persona p2 = new Persona(54321, "Nombre2", "Apellido2", 54321);
        Persona p3 = new Persona(98765, "Nombre3", "Apellido3", 98765);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
