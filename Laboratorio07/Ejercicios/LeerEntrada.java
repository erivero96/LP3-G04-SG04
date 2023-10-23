import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class ExcepcionVocal extends Exception {
    public ExcepcionVocal() {
        super("Error: Se ingresó una vocal. Debes ingresar un carácter diferente.");
    }
}
class ExcepcionNumero extends Exception {
    public ExcepcionNumero() {
        super("Error: Se ingresó un número. Debes ingresar un carácter diferente.");
    }
}

class ExcepcionBlanco extends Exception {
    public ExcepcionBlanco() {
        super("Error: Se ingresó un espacio en blanco. Debes ingresar un carácter diferente.");
    }
}

class ExcepcionSalida extends Exception {
    public ExcepcionSalida() {
        super("Programa finalizado: Se ingresó el carácter de salida.");
    }
}

class LeerEntrada {
    private Reader stream;

    public LeerEntrada(InputStream fuente) {
        this.stream = new InputStreamReader(fuente);
    }

    public char leerCaracter() throws IOException {
        return (char) this.stream.read();
    }
}
