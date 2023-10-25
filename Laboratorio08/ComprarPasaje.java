import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComprarPasaje {
    private JTextField nombreTextField, dniTextField, fechaViajeTextField;
    private JComboBox<String> origenComboBox, destinoComboBox;
    private JRadioButton primerPisoRadioButton, segundoPisoRadioButton;
    private JCheckBox audifonosCheckBox, mantaCheckBox, revistasCheckBox;
    private JList<String> calidadServicioList;
    private JTextArea resumenTextArea;

    public ComprarPasaje() {
        // Crear la ventana principal
        JFrame frame = new JFrame("Compra de Pasajes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Crear componentes
        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField(20);

        JLabel dniLabel = new JLabel("DNI:");
        dniTextField = new JTextField(10);

        JLabel origenLabel = new JLabel("Origen:");
        origenComboBox = new JComboBox<>(new String[]{"Arequipa", "Lima", "Tacna"});

        JLabel destinoLabel = new JLabel("Destino:");
        destinoComboBox = new JComboBox<>(new String[]{"Camana", "Ica", "Cuzco"});

        JLabel fechaViajeLabel = new JLabel("Fecha de Viaje:");
        fechaViajeTextField = new JTextField(10);

        JLabel pisoLabel = new JLabel("Piso:");
        primerPisoRadioButton = new JRadioButton("1er Piso");
        segundoPisoRadioButton = new JRadioButton("2do Piso");
        ButtonGroup pisoButtonGroup = new ButtonGroup();
        pisoButtonGroup.add(primerPisoRadioButton);
        pisoButtonGroup.add(segundoPisoRadioButton);

        JLabel serviciosLabel = new JLabel("Servicios Opcionales:");
        audifonosCheckBox = new JCheckBox("Audífonos");
        mantaCheckBox = new JCheckBox("Manta");
        revistasCheckBox = new JCheckBox("Revistas");

        JLabel calidadServicioLabel = new JLabel("Calidad de Servicio:");
        String[] calidadServicioOptions = {"Económico", "Standard", "VIP"};
        calidadServicioList = new JList<>(calidadServicioOptions);
        calidadServicioList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane calidadServicioScrollPane = new JScrollPane(calidadServicioList);

        JButton resumenButton = new JButton("Mostrar Resumen");
        resumenTextArea = new JTextArea(10, 30);

        // Crear un botón para limpiar elementos
        JButton limpiarButton = new JButton("Limpiar elementos");


        // Crear un JScrollPane para el JTextArea
        JScrollPane scrollPane = new JScrollPane(resumenTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Agregar componentes a la ventana
        frame.add(nombreLabel);
        frame.add(nombreTextField);
        frame.add(dniLabel);
        frame.add(dniTextField);
        frame.add(origenLabel);
        frame.add(origenComboBox);
        frame.add(destinoLabel);
        frame.add(destinoComboBox);
        frame.add(fechaViajeLabel);
        frame.add(fechaViajeTextField);
        frame.add(pisoLabel);
        frame.add(primerPisoRadioButton);
        frame.add(new JPanel()); // Espacio en blanco
        frame.add(segundoPisoRadioButton);
        frame.add(serviciosLabel);
        frame.add(audifonosCheckBox);
        frame.add(new JPanel()); // Espacio en blanco
        frame.add(mantaCheckBox);
        frame.add(new JPanel()); // Espacio en blanco
        frame.add(revistasCheckBox);
        frame.add(calidadServicioLabel);
        frame.add(calidadServicioScrollPane);
        frame.add(resumenButton);
        frame.add(limpiarButton);

        // Agregar un ActionListener al botón para mostrar el resumen en un cuadro de diálogo
        resumenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarResumen();
            }
        });

        // Agregar un ActionListener al botón de limpiar elementos
        limpiarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });


        // Configurar la ventana
        frame.pack();
        frame.setVisible(true);
    }

    private void mostrarResumen() {
        String nombre = nombreTextField.getText();
        String dni = dniTextField.getText();
        String origen = (String) origenComboBox.getSelectedItem();
        String destino = (String) destinoComboBox.getSelectedItem();
        String fechaViaje = fechaViajeTextField.getText();
        String piso = primerPisoRadioButton.isSelected() ? "1er Piso" : "2do Piso";
        String servicios = obtenerServiciosSeleccionados();
        String calidadServicio = calidadServicioList.getSelectedValue();

        String resumen = "Resumen de la compra:\n";
        resumen += "Nombre: " + nombre + "\n";
        resumen += "DNI: " + dni + "\n";
        resumen += "Origen: " + origen + "\n";
        resumen += "Destino: " + destino + "\n";
        resumen += "Fecha de Viaje: " + fechaViaje + "\n";
        resumen += "Piso: " + piso + "\n";
        resumen += "Servicios: " + servicios + "\n";
        resumen += "Calidad de Servicio: " + calidadServicio;

        // Mostrar el resumen en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, resumen, "Resumen de la Compra", JOptionPane.INFORMATION_MESSAGE);
    }

    private String obtenerServiciosSeleccionados() {
        String servicios = "";

        if (audifonosCheckBox.isSelected()) {
            servicios += "Audífonos, ";
        }

        if (mantaCheckBox.isSelected()) {
            servicios += "Manta, ";
        }

        if (revistasCheckBox.isSelected()) {
            servicios += "Revistas, ";
        }

        if (servicios.isEmpty()) {
            return "Sin servicios adicionales";
        }

        return servicios.substring(0, servicios.length() - 2);
    }

    private void limpiarCampos() {
        // Restablecer todos los campos y áreas de texto
        nombreTextField.setText("");
        dniTextField.setText("");
        origenComboBox.setSelectedIndex(0);
        destinoComboBox.setSelectedIndex(0);
        fechaViajeTextField.setText("");
        primerPisoRadioButton.setSelected(true);
        audifonosCheckBox.setSelected(false);
        mantaCheckBox.setSelected(false);
        revistasCheckBox.setSelected(false);
        calidadServicioList.clearSelection();
        resumenTextArea.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComprarPasaje();
            }
        });
    }
}
