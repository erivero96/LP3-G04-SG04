public abstract class FiguraTridimensional extends Figura{
    protected double volumen;

    FiguraTridimensional() {
        this.area = 0.0;
        this.volumen = 0.0;
    }

    public void obtenerVolumen() {
        System.out.print("Volumen: ");
    }

    public void figura(){
        super.figura();
        System.out.println("Soy una figura Tridimensional");
    }
}
