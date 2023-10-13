public class App {
    public static void main(String[] args) throws Exception {
        Figura figuras[] = new Figura[6];

        figuras[0] = new Circulo(2.0);
        figuras[1] = new Cuadrado(3.0); 
        figuras[2] = new Triangulo(3.0, 4.0);
        figuras[3] = new Esfera(2.0);
        figuras[4] = new Cubo(2.0);
        figuras[5] = new Tetraedro(2.0);

        for(Figura pivote : figuras) {
            
            if(pivote instanceof FiguraBidimensional) {
                pivote.obtenerArea();
            }

            if(pivote instanceof FiguraTridimensional) {
                FiguraTridimensional pivote2 = (FiguraTridimensional) pivote;
                pivote2.obtenerArea();
                pivote2.obtenerVolumen();
            }
            pivote.figura();
        }
    }
}
