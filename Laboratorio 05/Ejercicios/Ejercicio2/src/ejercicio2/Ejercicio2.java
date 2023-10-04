package ejercicio2;
public class Ejercicio2 {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("DEF456", 4, "Toyota", "Yaris");
        Automovil a2 = new Automovil("ABC123", 2, "Honda", "Civic");
        System.out.println(a1);
        Motor m = new Motor(1234, 3000);
        a2.asignarMotor(m);
        System.out.println(a2);
    }
}