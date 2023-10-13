public final class Cuadrado extends FiguraBidimensional {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public void obtenerArea() {
        area = lado*lado;
        super.obtenerArea();
        
    }

    public void figura(){
        super.figura();
        System.out.println("Soy un cuadrado\n");
    }
}
