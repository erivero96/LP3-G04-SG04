public class Tetraedro extends FiguraTridimensional {
    private double arista;

    public Tetraedro(double arista) {
        this.arista = arista;
    }

    @Override
    public void obtenerArea() {
        area = Math.sqrt(3) * arista * arista;
        super.obtenerArea();
    }

    @Override
    public void obtenerVolumen() {
        volumen = (Math.sqrt(2)/12) *arista * arista * arista;
        super.obtenerVolumen();
        System.out.println(volumen);
    }

    @Override
    public void figura() {
        super.figura();
        System.out.println("Soy un Tetraedro\n");
    }
}
