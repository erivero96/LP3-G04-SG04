public class TestHerencia {
    public static void main(String[] args) {
        Asalariado empleado1 = new Asalariado("Manuel Cortina", 123451, 28, 2000.0);

        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Juan Mota", 43232323, 30, "noche", 1500.0);

        EmpleadoDistribucion empleado3 = new EmpleadoDistribucion("Antonio Camino", 490249293, 35, "Granada", 1800.0);

        // Calcular y mostrar la nómina de los empleados
        System.out.println("Nómina de " + empleado1.getNombre() + ": " + empleado1.calcularNomina());
        System.out.println("\nNómina de " + empleado2.getNombre() + ": " + empleado2.calcularNomina());
        System.out.println("\nNómina de " + empleado3.getNombre() + ": " + empleado3.calcularNomina());

        // Mostrar información completa de los empleados
        System.out.println("\nInformación de " + empleado1.getNombre() + ":\n" + empleado1.toString());
        System.out.println("\nInformación de " + empleado2.getNombre() + ":\n" + empleado2.toString());
        System.out.println("\nInformación de " + empleado3.getNombre() + ":\n" + empleado3.toString());
    }
}
