import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        Edificio edificio = new Edificio(100, 500);
        objetos.add(edificio);
        Auto auto = new Auto(10000, 5);
        objetos.add(auto);
        Bicicleta bicicleta = new Bicicleta(365);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.toString());
            System.out.println("Impacto Ecologico: " + objeto.obtenerImpactoEcologico());
            System.out.println(); 
        }
    }
}
