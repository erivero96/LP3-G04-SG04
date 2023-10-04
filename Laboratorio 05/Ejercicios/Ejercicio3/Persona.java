import java.util.Scanner;

public class Persona {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private static Integer numClienteB = 5000;
    private static Integer numClienteE = 8000;
    private static Integer numClienteC = 1000;
    private char tipoCliente;
    

    Persona(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = 'C';
        String numCuenta = tipoCliente + numClienteC.toString();
        this.cuenta = new Cuenta(numCuenta);
        
    }

    Persona(int id, String nombre, String apellido, char tipoCliente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        String numCuenta = " ";
        
        this.tipoCliente = tipoCliente;
        
        if(tipoCliente == 'C') {
            numCuenta = tipoCliente + numClienteC.toString();
        }

        if(tipoCliente == 'B') {
            numCuenta = tipoCliente + numClienteB.toString();
        }

        if(tipoCliente == 'E') {
            numCuenta = tipoCliente + numClienteE.toString();
        }

        this.cuenta = new Cuenta(numCuenta);
    }

    // Getter para el campo 'id'
    public int getId() {
        return id;
    }

    // Setter para el campo 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter para el campo 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter para el campo 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para el campo 'apellido'
    public String getApellido() {
        return apellido;
    }

    // Setter para el campo 'apellido'
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // Getter para el campo 'cuenta'
    public Cuenta getCuenta() {
        return cuenta;
    }

    // Setter para el campo 'cuenta'
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public char getTipoCliente() {
        return this.tipoCliente;
    }

    public void setTipoCliente(char tipoCliente) {
        this.tipoCliente = tipoCliente;
    }


    @Override
    public String toString() {
    return "Cliente: " + id +"\nTipo: " +tipoCliente + "\nNombres: " + nombre + " " + apellido + "\nCuenta: " + cuenta.getNumero() + "      Saldo: " + cuenta.getSaldo();
    }
}