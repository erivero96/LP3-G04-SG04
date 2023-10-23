public class App {
    public static void main(String[] args) {
        double[] v = new double[15];

        try {
            acceso(v, 16);
        } catch (Exception e) {
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }
    }

    public static double acceso(double[] v, int j) throws Exception {
        try {
            if (j >= 0 && j < v.length) {
                return v[j];
            } else {
                throw new Exception("El índice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }
}
