package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ManejadorArchivos {
    private final List<Empleado> listaEmpleados;

    public ManejadorArchivos() {
        this.listaEmpleados = new ArrayList<>();
    }

    public List<Empleado> cargarEmpleados() {
        try (BufferedReader br = new BufferedReader(new FileReader("Ejercicio1/empleados.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                String nombre = br.readLine();
                double sueldo = Double.parseDouble(br.readLine());

                Empleado empleado = new Empleado(numero, nombre, sueldo);
                listaEmpleados.add(empleado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("Ejercicio1/empleados.txt", true))) {
            // Agregar el nuevo empleado al archivo
            writer.println(empleado.getNumero());
            writer.println(empleado.getNombre());
            writer.println(empleado.getSueldo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
