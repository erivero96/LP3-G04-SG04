import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Ejercicio1 extends JFrame {
    JButton filtroButton = new JButton("Apply Filter");
    JButton queryButton = new JButton("Submit Query");
    JTextField filtroField = new JTextField(20);
    JTextField queryField = new JTextField(20);
    JLabel filtroLabel = new JLabel("Filter");
    JTable resultadosTable = new JTable();
    JScrollPane scrollPane = new JScrollPane(resultadosTable);

    public Ejercicio1() {
        super("Displaying Query Results");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cargarComponentes();
    }

    public void cargarComponentes() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel();
        JPanel filterPanel = new JPanel();

        inputPanel.add(new JLabel("Query"));
        inputPanel.add(queryField);
        inputPanel.add(queryButton);

        filterPanel.add(filtroLabel);
        filterPanel.add(filtroField);
        filterPanel.add(filtroButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(filterPanel, BorderLayout.SOUTH);

        add(panel);

        // Event listeners
        queryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String query = queryField.getText();
                executeQuery(query);
            }
        });

        filtroButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String filter = filtroField.getText();
                applyFilter(filter);
            }
        });
    }
    

    public void executeQuery(String query) {
        try {
            // Establecer la conexión con la base de datos
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiante", "root", "root");

            // Crear la sentencia SQL
            PreparedStatement statement = connection.prepareStatement(query);

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Obtener los metadatos de los resultados
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Obtener el número de columnas
            int columnCount = metaData.getColumnCount();

            // Crear el modelo de tabla
            DefaultTableModel model = new DefaultTableModel();

            // Agregar las columnas al modelo
            for (int i = 1; i <= columnCount; i++) {
                model.addColumn(metaData.getColumnName(i));
            }

            // Agregar las filas al modelo
            while (resultSet.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                model.addRow(row);
            }

            // Establecer el modelo de tabla en la tabla de resultados
            resultadosTable.setModel(model);

            // Cerrar la conexión y liberar recursos
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void applyFilter(String filter) {
        DefaultTableModel model = (DefaultTableModel) resultadosTable.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        resultadosTable.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + filter));
    }

    public static void main(String[] args) {
        new Ejercicio1().setVisible(true);
    }
}
