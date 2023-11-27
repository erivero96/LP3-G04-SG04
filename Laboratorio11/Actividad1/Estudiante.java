public class Estudiante extends Persona {
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String nombre, String direccion, String telefono, String especialidad, Procedencia procedencia) {
        super(nombre, direccion, telefono);
        this.especialidad = especialidad;
        this.procedencia = procedencia;
    }

    public boolean contiene(Estudiante estudiante) {
        return this.nombre.equals(estudiante.nombre) && this.procedencia.equals(estudiante.procedencia);
    }
}
