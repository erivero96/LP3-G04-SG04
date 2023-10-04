public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, String turno, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.turno = turno;
    }
    
    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Override para calcular la nómina de EmpleadoProduccion con incremento del 15%
    @Override
    public double calcularNomina() {
        return getSalarioBase() * 1.15;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTurno: " + turno + "\nNómina: " + calcularNomina();
    }
}
