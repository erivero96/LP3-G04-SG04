public class Esfera extends FiguraTridimensional{
    public double radio;

    Esfera(double radio) {
        super();
        this.radio = radio;
    }

    @Override
    public void obtenerArea() {
        area = 4*3.1416*radio*radio;
        super.obtenerArea();
    }

    public void obtenerVolumen() {
        volumen = (4.0/3)*3.1416 * radio * radio * radio;
        super.obtenerVolumen();
        System.out.println(volumen);
    }
    
    @Override
    public void figura() {
        super.figura();
        System.out.println("Soy una Esfera\n");
    }
}
