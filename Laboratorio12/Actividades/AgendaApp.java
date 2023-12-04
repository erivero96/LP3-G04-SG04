import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgendaApp extends JFrame {
    private JTextField txtID, txtNombre, txtApellido, txtEmail, txtTelefono;
    private JButton btnPrev, btnNext, btnInsert, btnSearch;

    private Connection connection;
    private ResultSet resultSet;

    public AgendaApp() {
        super("Agenda App");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear componentes
        txtID = new JTextField(5);
        txtNombre = new JTextField(20);
        txtApellido = new JTextField(20);
        txtEmail = new JTextField(20);
        txtTelefono = new JTextField(15);

        btnPrev = new JButton("Prev");
        btnNext = new JButton("Next");
        btnInsert = new JButton("Insert");
        btnSearch = new JButton("Search");

        // Crear paneles
        JPanel panelMain = new JPanel(new BorderLayout());
        JPanel panelNav = new JPanel();
        JPanel panelInfo = new JPanel();

        // Agregar componentes a los paneles
        panelNav.add(new JLabel("ID:"));
        panelNav.add(txtID);
        panelNav.add(btnPrev);
        panelNav.add(btnNext);
        panelNav.add(btnSearch);

        panelInfo.add(new JLabel("Nombre:"));
        panelInfo.add(txtNombre);
        panelInfo.add(new JLabel("Apellido:"));
        panelInfo.add(txtApellido);
        panelInfo.add(new JLabel("Email:"));
        panelInfo.add(txtEmail);
        panelInfo.add(new JLabel("Teléfono:"));
        panelInfo.add(txtTelefono);

        panelMain.add(panelNav, BorderLayout.NORTH);
        panelMain.add(panelInfo, BorderLayout.CENTER);
        panelMain.add(btnInsert, BorderLayout.SOUTH);

        add(panelMain);

        // Establecer conexión a la base de datos
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/agenda", "root", "root");
            cargarPrimerContacto();  // Cargar el primer contacto al inicio
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Agregar listeners
        btnPrev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarContactoAnterior();
            }
        });

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cargarContactoSiguiente();
            }
        });

        btnInsert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                insertarContacto();
            }
        });

        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buscarContactoPorApellido();
            }
        });
    }

    private void cargarPrimerContacto() {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM agenda");
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                mostrarContactoActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarContactoAnterior() {
        try {
            if (resultSet.previous()) {
                mostrarContactoActual();
            } else {
                resultSet.last();
                mostrarContactoActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void cargarContactoSiguiente() {
        try {
            if (resultSet.next()) {
                mostrarContactoActual();
            } else {
                resultSet.first();
                mostrarContactoActual();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void mostrarContactoActual() {
        try {
            txtID.setText(resultSet.getString("ID"));
            txtNombre.setText(resultSet.getString("Nombre"));
            txtApellido.setText(resultSet.getString("Apellido"));
            txtEmail.setText(resultSet.getString("Email"));
            txtTelefono.setText(resultSet.getString("Telefono"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertarContacto() {
        try {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String email = txtEmail.getText();
            String telefono = txtTelefono.getText();

            PreparedStatement statement = connection.prepareStatement("INSERT INTO agenda (ID, Nombre, Apellido, Email, Telefono) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, ID);
            statement.setString(2, nombre);
            statement.setString(3, apellido);
            statement.setString(4, email);
            statement.setString(5, telefono);
            

            int filasAfectadas = statement.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Contacto insertado exitosamente.");
                // Actualizar el ResultSet para incluir el nuevo contacto
                resultSet = statement.getGeneratedKeys();
                cargarContactoAnterior();  // Cargar el nuevo contacto
            } else {
                System.out.println("No se pudo insertar el contacto.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void buscarContactoPorApellido() {
        try {
            String apellido = txtApellido.getText();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM agenda WHERE Apellido = ?");
            statement.setString(1, apellido);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                mostrarContactoActual();
            } else {
                System.out.println("No se encontró ningún contacto con ese apellido.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        AgendaApp agendaApp = new AgendaApp();
        agendaApp.setVisible(true);
    }
}
