public class EmpleadoDistribucion extends Asalariado {
    private String region;

    public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, String region, double salarioBase) {
        super(nombre, dni, diasVacaciones, salarioBase);
        this.region = region;
    }
    

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    // Override para calcular la nómina de EmpleadoDistribucion con incremento del 10%
    @Override
    public double calcularNomina() {
        return getSalarioBase() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegión: " + region + "\nNómina: " + calcularNomina();
    }
}