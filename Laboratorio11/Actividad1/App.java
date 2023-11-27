public class App {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("John Doe", "123 Main St", "555-1234"),
                new Persona("Jane Smith", "456 Elm St", "555-5678"),
                new Persona("Mike Johnson", "789 Oak St", "555-9012")
        };

        Goodies[] goodies = {
                new Goodies(1, "Chocolate", 2.99f),
                new Goodies(2, "Candy", 1.99f),
                new Goodies(3, "Cookies", 3.99f)
        };

        Estudiante[] estudiantes = {
                new Estudiante("John Doe", "123 Main St", "555-1234", "Computer Science", new Procedencia("Department A", "Province X")),
                new Estudiante("Jane Smith", "456 Elm St", "555-5678", "Mathematics", new Procedencia("Department B", "Province Y")),
                new Estudiante("Mike Johnson", "789 Oak St", "555-9012", "Physics", new Procedencia("Department C", "Province Z"))
        };

        Persona personaToFind = new Persona("John Doe", "123 Main St", "555-1234");
        Goodies goodiesToFind = new Goodies(2, "Candy", 1.99f);
        Estudiante estudianteToFind = new Estudiante("Jane Smith", "456 Elm St", "555-5678", "Mathematics", new Procedencia("Department B", "Province Y"));

        boolean personaExists = containsObject(personas, personaToFind);
        boolean goodiesExists = containsObject(goodies, goodiesToFind);
        boolean estudianteExists = containsObject(estudiantes, estudianteToFind);

        System.out.println("Persona exists: " + personaExists);
        System.out.println("Goodies exists: " + goodiesExists);
        System.out.println("Estudiante exists: " + estudianteExists);
    }

    public static <T extends Contenedora<T>> boolean containsObject(T[] array, T object) {
        for (T item : array) {
            if (item.contiene(object)) {
                return true;
            }
        }

        return false;
    }
}
