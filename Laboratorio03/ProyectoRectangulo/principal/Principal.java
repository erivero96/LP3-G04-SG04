package principal;
public class Principal {
    public static void main(String[] args) {
        //RECTANGULO A PARTIR DE BASE Y ALTURA
        Rectangulo r1 = new Rectangulo(9, 4);
        Manejador m1 = new Manejador(r1);
        System.out.println("Area r1: " + m1.area());
        System.out.println("Perimetro r1: " + m1.perimetro());
        System.out.println("Diagonal: " + Coordenada.distancia(r1.getEsquina1(), r1.getEsquina2()));
        System.out.println("Rectangulo 2 = " + r1);
        
        //RECTANGULO A PARTIR DE COORDENADAS
        Coordenada coord1 = new Coordenada(0,9);
        Coordenada coord2 = new Coordenada(16,18);
        Rectangulo r2 = new Rectangulo(coord1, coord2);
        Manejador m2 = new Manejador(r2);
        System.out.println("\n\nArea r2: " + m2.area());
        System.out.println("Perimetro r2: " + m2.perimetro());
        System.out.println("Diagonal: " + Coordenada.distancia(coord1, coord2));
        System.out.println("Rectangulo 2 = " + r2);
        
        //MOVEMOS COORDENADAS DE TAL MANERA QUE UNA ESQUINA SEA EL ORIGEN
        m2.moverY(-9);
        System.out.println("\n\nRectangulo 2 = " + r2);
        
        //RECTANGULO AMARILLO
        Rectangulo r3 = new Rectangulo(3,4);
        System.out.println("\n\nRectangulo 3 = " + r3);
        
        //RECTANGULO VERDE NUEVAMENTE
        Rectangulo r4 = new Rectangulo(24,7);
        System.out.println("\n\nRectangulo 4 = " + r4);
    }
}
