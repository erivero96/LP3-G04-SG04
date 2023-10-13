public class Triangulo extends FiguraBidimensional {
    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void obtenerArea() {
        area = base * altura;
        super.obtenerArea();
    }

    @Override
    public void figura(){
        super.figura();
        System.out.println("Soy un triangulo\n");
    }
}
