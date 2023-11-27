import java.util.Scanner;

public class Contacts {
    private Dictionary<String, String, Pair<String, String>> contactos;

    public Contacts() {
        this.contactos = new Dictionary<>();
    }

    public void agregarContacto(String dni, String datos) {
        OrderedPair<String, String> contacto = new OrderedPair<>(dni, datos);
        this.contactos.add(contacto);
    }

    public boolean eliminarContacto(String dni) {
        return this.contactos.delete(dni);
    }

    public String obtenerDatos(String dni) {
        return this.contactos.getValue(dni);
    }

    public void mostrarContactos() {
        System.out.println(this.contactos.toString());
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----- MENU DE CONTACTOS -----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Obtener datos de contacto");
            System.out.println("4. Mostrar todos los contactos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI del contacto: ");
                    String dni = scanner.next();
                    System.out.print("Ingrese los datos del contacto: ");
                    String datos = scanner.next();
                    agregarContacto(dni, datos);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el DNI del contacto a eliminar: ");
                    dni = scanner.next();
                    boolean eliminado = eliminarContacto(dni);
                    if (eliminado) {
                        System.out.println("Contacto eliminado correctamente.");
                    } else {
                        System.out.println("No se encontró un contacto con ese DNI.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el DNI del contacto a consultar: ");
                    dni = scanner.next();
                    String datosContacto = obtenerDatos(dni);
                    if (datosContacto != null) {
                        System.out.println("Datos del contacto: " + datosContacto);
                    } else {
                        System.out.println("No se encontró un contacto con ese DNI.");
                    }
                    break;
                case 4:
                    mostrarContactos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        contacts.mostrarMenu();
    }
}
