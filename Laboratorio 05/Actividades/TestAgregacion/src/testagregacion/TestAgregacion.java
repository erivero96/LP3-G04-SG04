package testagregacion;
public class TestAgregacion {
    public static void main(String[] args) {
        Motor m1 = new Motor(12341, 4000);
        Motor m2 = new Motor(98742, 1500);
        Automovil a1 = new Automovil("V34-A32", 4, "Toyota", "Hilux", m1);
        Automovil a2 = new Automovil("G31-2F2", 2, "Honda", "Civic", m2);
        Automovil a3 = new Automovil("HJ3-OPQ", 4, "BMW", "X2", m1);
        
    }
}
