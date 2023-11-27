
public class Persona implements Contenedora<Persona> {
    protected String nombre;
    protected String direccion;
    protected String telefono;

    public Persona(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public boolean contiene(Persona persona) {
        return this.nombre.equals(persona.nombre);
    }
}




