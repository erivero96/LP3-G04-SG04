import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class App {
    public static void main(String[] args) {
        try {
            // Establecer la conexión con la base de datos
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiante", "root", "root");

            // a. Operaciones Insertar, Recuperar, Actualizar, Borrar registros de una tabla
            insertarRegistro(connection);
            recuperarRegistros(connection);
            actualizarRegistro(connection);
            borrarRegistro(connection);

            // b. Interfaz RowSet
            usarRowSet();

            // c. Interfaz PreparedStatement
            usarPreparedStatement(connection);

            // d. Llamada a procedimientos almacenados
            llamarProcedimientoAlmacenado(connection);

            // e. Manejo de Transacciones en JDBC
            manejarTransacciones();

            // Cerrar la conexión
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // a. Operaciones Insertar, Recuperar, Actualizar, Borrar registros de una tabla
    public static void insertarRegistro(Connection connection) throws Exception {
        String insertQuery = "INSERT INTO estudiante VALUES (?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
        insertStatement.setString(1, "202210");
        insertStatement.setString(2, "Amit");
        insertStatement.setString(3, "IV");
        insertStatement.executeUpdate();
    }

    public static void recuperarRegistros(Connection connection) throws Exception {
        String selectQuery = "SELECT * FROM estudiante";
        Statement selectStatement = connection.createStatement();
        ResultSet resultSet = selectStatement.executeQuery(selectQuery);
        while (resultSet.next()) {
            String codigo = resultSet.getString("Codigo");
            String nombre = resultSet.getString("Nombre");
            String semestre = resultSet.getString("Semestre");
            System.out.println(codigo + " - " + nombre + " - " + semestre);
        }
    }

    public static void actualizarRegistro(Connection connection) throws Exception {
        String updateQuery = "UPDATE estudiante SET Nombre = ? WHERE Codigo = ?";
        PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
        updateStatement.setString(1, "Claudia");
        updateStatement.setString(2, "Codigo");
        updateStatement.executeUpdate();
    }

    public static void borrarRegistro(Connection connection) throws Exception {
        String deleteQuery = "DELETE FROM estudiante WHERE Codigo = ?";
        PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
        deleteStatement.setString(1, "Codigo");
        deleteStatement.executeUpdate();
    }

    // b. Interfaz RowSet
    public static void usarRowSet() throws Exception {
        CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/estudiante");
        rowSet.setUsername("root");
        rowSet.setPassword("root");
        rowSet.setCommand("SELECT * FROM estudiante");
        rowSet.execute();
        while (rowSet.next()) {
            String codigo = rowSet.getString("Codigo");
            String nombre = rowSet.getString("Nombre");
            String semestre = rowSet.getString("Semestre");
            System.out.println(codigo + " - " + nombre + " - " + semestre);
        }
    }

    // c. Interfaz PreparedStatement
    public static void usarPreparedStatement(Connection connection) throws Exception {
        String parametrizedQuery = "SELECT * FROM estudiante WHERE Codigo = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(parametrizedQuery);
        preparedStatement.setString(1, "202280");
        System.out.println("Codigo" + " - " + "Nombre"+ " - " + "Semestre");
        ResultSet parametrizedResultSet = preparedStatement.executeQuery();
        while (parametrizedResultSet.next()) {
            String codigo = parametrizedResultSet.getString("Codigo");
            String nombre = parametrizedResultSet.getString("Nombre");
            String semestre = parametrizedResultSet.getString("Semestre");
            System.out.println(codigo + " - " + nombre + " - " + semestre);
        }
    }

    // d. Llamada a procedimientos almacenados
    public static void llamarProcedimientoAlmacenado(Connection connection) throws Exception {
        CallableStatement stmt = connection.prepareCall("{call INSERTAR(?,?,?)}");
        stmt.setString(1,"202250");
        stmt.setString(2,"Amit");
        stmt.setString(3, "IV");
        stmt.execute();

        CallableStatement buscar = connection.prepareCall("{? = call contarAlumnos(?)}");
        System.out.println("success");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el semestre a buscar: ");
        String semestre = sc.nextLine();
        buscar.setString(2, semestre);
        buscar.registerOutParameter(1,Types.INTEGER);
        buscar.execute();
        int count = buscar.getInt(1); // Get the return value from the OUT parameter
        System.out.println("Número de alumnos: " + count);
    }

    // e. Manejo de Transacciones en JDBC
    public static void manejarTransacciones() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiante", "root", "root");
        connection.setAutoCommit(false); // Desactivar el modo de autocommit
        String insertQuery = "INSERT INTO estudiante VALUES (?, ?, ?)";
        PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
        insertStatement.setString(1, "202210");
        insertStatement.setString(2, "Amit");
        insertStatement.setString(3, "IV");
        insertStatement.executeUpdate();

        connection.commit(); // Confirmar la transacción
        connection.setAutoCommit(true); // Activar el modo de autocommit nuevamente

        // Cerrar la conexión
        connection.close();
    }
}
