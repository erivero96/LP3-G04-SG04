import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerEntrada entrada = new LeerEntrada(System.in);
        char caracter;

        try {
            while (true) {
                caracter = entrada.leerCaracter();
                if (Character.isLetter(caracter)) {
                    if ("AEIOUaeiou".indexOf(caracter) >= 0) {
                        throw new ExcepcionVocal();
                    }
                } else if (Character.isDigit(caracter)) {
                    throw new ExcepcionNumero();
                } else if (Character.isWhitespace(caracter)) {
                    throw new ExcepcionBlanco();
                } else if (caracter == '\n' || caracter == '\r') {
                    throw new ExcepcionSalida();
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer entrada: " + e.getMessage());
        } catch (ExcepcionVocal e) {
            System.err.println(e.getMessage());
        } catch (ExcepcionNumero e) {
            System.err.println(e.getMessage());
        } catch (ExcepcionBlanco e) {
            System.err.println(e.getMessage());
        } catch (ExcepcionSalida e) {
            System.out.println(e.getMessage());
        }
    }
}
