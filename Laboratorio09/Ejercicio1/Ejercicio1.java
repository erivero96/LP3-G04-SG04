package Ejercicio1;

import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        MarcoApp app = new MarcoApp();

        // Crear el manejador de archivos y cargar empleados
        ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
        List<Empleado> empleados = manejadorArchivos.cargarEmpleados();

        // Cargar empleados en la tabla
        for (Empleado empleado : empleados) {
            Object[] fila = {empleado.getNumero(), empleado.getNombre(), empleado.getSueldo()};
            app.getModeloTabla().addRow(fila);
        }

        app.setSize(500, 600);
        app.setVisible(true);
    }
}