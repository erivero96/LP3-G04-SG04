import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class Serial15 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream salida = null;
        Alumno a;
        Fecha f;

        try{
            fos = new FileOutputStream("alumno.dat");
            salida = new ObjectOutputStream(fos);
            f = new Fecha(1, 1, 2000);
            a = new Alumno("12345678A", "Pepe", 20, f);
            salida.writeObject(a);
            f = new Fecha(2, 2, 2001);
            a = new Alumno("87654321B", "Juan", 21, f);
            salida.writeObject(a);
            f = new Fecha(3, 3, 2002);
            a = new Alumno("11111111C", "Ana", 22, f);  
            salida.writeObject(a);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(fos!=null) fos.close();
                if(salida!=null) salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
