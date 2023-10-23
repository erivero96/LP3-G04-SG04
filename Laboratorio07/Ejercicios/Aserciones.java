public class Aserciones {
    public static void main(String[] args) {
        int resultado = dividir(10, 2);
        System.out.println("Resultado de la división: " + resultado);
    }

    public static int dividir(int dividendo, int divisor) {
        assert divisor != 0 : "El divisor no puede ser cero.";
        return dividendo / divisor;
    }
}

