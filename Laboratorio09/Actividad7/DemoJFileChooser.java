import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DemoJFileChooser extends JFrame{
    private final JTextArea areaTexto;

    public DemoJFileChooser() throws IOException{
        super("Demo de JFileChooser");
        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto));
        analizarRuta();
    }

    public void analizarRuta() throws IOException {
        areaTexto.setText("Escriba la ruta del archivo o directorio: ");
        Path ruta = obtenerRutaArchivo();
        if(Files.exists(ruta)) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s existe%n", ruta.getFileName()));
            builder.append(String.format("%s un directorio%n", Files.isDirectory(ruta) ? "Es" : "No es"));
            builder.append(String.format("%s una ruta absoluta", ruta.isAbsolute() ? "Es" : "No es"));
            builder.append(String.format("ultima modificacion: %s%n", Files.getAttribute(ruta, "lastModifiedTime")));
            builder.append(String.format("tamano: %s%n", Files.size(ruta)));
            builder.append(String.format("Ruta: %s%n", ruta));
            builder.append(String.format("Ruta absoluta: %s%n", ruta.toAbsolutePath()));
            
            if(Files.isDirectory(ruta)) {
                builder.append(String.format("%nContenido del directorio:%n"));
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta);

                for(Path p: flujoDirectorio)
                    builder.append(String.format("%s%n"));

            }
            areaTexto.setText(builder.toString());
    }
    else {
        JOptionPane.showMessageDialog(this, ruta.getFileName() + " no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }

    private Path obtenerRutaArchivo() {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivo.showOpenDialog(this);
        if(resultado == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        return selectorArchivo.getSelectedFile().toPath();
    }
}
