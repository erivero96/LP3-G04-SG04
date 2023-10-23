import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManejoArchivos {
    public static void main(String[] args) {
        try {
            String contenido = leerArchivo("archivo.txt");
            System.out.println("Contenido del archivo: " + contenido);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static String leerArchivo(String nombreArchivo) throws IOException {
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Archivo no encontrado: " + fnfe.getMessage());
            throw fnfe;
        } catch (IOException ioe) {
            System.err.println("Error de lectura/escritura: " + ioe.getMessage());
            throw ioe;
        }
        return contenido.toString();
    }
}
