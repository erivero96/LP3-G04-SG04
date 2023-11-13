package Ejercicio1;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MarcoApp extends JFrame{

    private final JTextField campoNumero;
    private final JTextField campoNombre;
    private final JTextField campoSueldo;
    private final JButton agregarEmpleadoBoton;
    private final DefaultTableModel modeloTabla;

    public MarcoApp() {
        super("Empleados");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel para el ingreso de datos
        JPanel panelDatos = new JPanel(new GridLayout(4, 2));
        
        panelDatos.add(new JLabel("Datos del empleado"));
        panelDatos.add(new JLabel(""));

        campoNumero = new JTextField(6);
        panelDatos.add(new JLabel("Numero:"));
        panelDatos.add(campoNumero);

        campoNombre = new JTextField(30);
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(campoNombre);

        campoSueldo = new JTextField(5);
        panelDatos.add(new JLabel("Sueldo:"));
        panelDatos.add(campoSueldo);

        //Panel para el boton
        JPanel panelBoton = new JPanel(new FlowLayout());
        agregarEmpleadoBoton = new JButton("Agregar empleado");
        panelBoton.add(agregarEmpleadoBoton);
        //Escuchador para boton
        ManejadorBoton manejador = new ManejadorBoton();
        agregarEmpleadoBoton.addActionListener(manejador);

        // Crear tabla para mostrar los empleados
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Numero");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Sueldo");
        JTable tabla = new JTable(modeloTabla);

        //Ventana principal
        setLayout(new BorderLayout());
        add(panelDatos, BorderLayout.NORTH);
        add(panelBoton, BorderLayout.CENTER);
        add(new JScrollPane(tabla), BorderLayout.SOUTH);
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    private class ManejadorBoton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent evento){
            String numero = campoNumero.getText();
            String nombre = campoNombre.getText();
            String sueldo = campoSueldo.getText();

            if (numero.isEmpty() || nombre.isEmpty() || sueldo.isEmpty()) {
                JOptionPane.showMessageDialog(MarcoApp.this, "Por favor, complete todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Object[] fila = {numero, nombre, sueldo};
            modeloTabla.addRow(fila);

            // Crear un nuevo objeto Empleado
            Empleado nuevoEmpleado = new Empleado(Integer.parseInt(numero), nombre, Double.parseDouble(sueldo));

            // Agregar el nuevo empleado al archivo empleados.txt
            ManejadorArchivos manejadorArchivos = new ManejadorArchivos();
            manejadorArchivos.agregarEmpleado(nuevoEmpleado);

            campoNumero.setText("");
            campoNombre.setText("");
            campoSueldo.setText("");
        } 
    }
}