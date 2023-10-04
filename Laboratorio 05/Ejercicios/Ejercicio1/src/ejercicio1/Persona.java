package ejercicio1;
public class Persona {
    private String id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private String tipoCliente;

    public Persona(String id, String nombre, String apellido, char tipo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta(tipo);
        switch (tipo){
            case 'C':
                this.tipoCliente = "Cliente";
                break;
            case 'B':
                this.tipoCliente = "Banca Exclusiva";
                break;
            case 'E':
                this.tipoCliente = "Empresarial";
                break;
            default:
                System.out.println("No existe ese tipo de cliente");
                this.tipoCliente = "Cliente";
                break;
        }
    }

    public Persona(String id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = new Cuenta('C');
        this.tipoCliente = "Cliente";
    }
    
    public void retirar(double cantidad){
        this.cuenta.retirar(cantidad);
    }
    public void depositar(double cantidad){
        this.cuenta.depositar(cantidad);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + id + "\nTipo: " + tipoCliente + "\nNombres: " + nombre + " " + apellido + "\n" + cuenta;
    }
    
}