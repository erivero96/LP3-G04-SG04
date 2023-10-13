public final class Circulo extends FiguraBidimensional{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void obtenerArea() {
        area = 3.1416 * (radio * radio);
        super.obtenerArea();
    }

    public void figura(){
        super.figura();
        System.out.println("Soy un ciculo\n");
    }
}
