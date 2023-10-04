public class Asalariado {
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salarioBase;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getDiasVacaciones() {
        return this.diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método para calcular la nómina
    public double calcularNomina() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDNI: " + dni + "\nDías de Vacaciones: " + diasVacaciones + "\nSalario Base: " + salarioBase;
    }
}
