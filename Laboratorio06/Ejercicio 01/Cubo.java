public class Cubo extends FiguraTridimensional {
    public double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public void obtenerArea() {
        area = 6*lado*lado;
        super.obtenerArea();
        System.out.println(area);
    }

    @Override
    public void obtenerVolumen() {
        volumen = lado*lado*lado;
        super.obtenerVolumen();
    }

    @Override
    public void figura() {
        super.figura();
        System.out.println("Soy un cubo\n");
    }
}
