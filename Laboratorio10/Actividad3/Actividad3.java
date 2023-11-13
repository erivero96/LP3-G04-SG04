public class Actividad3 {
    public static void main(String[] args) {
        Integer[] arregloEnteros = {1, 2, 3, 4, 5};
        String[] arregloStrings = {"Hola", "Mundo", "!"};
        
        try {
            imprimirArray(arregloEnteros, 1, 3);
            imprimirArray(arregloStrings, 1, 1);
        } catch (LimiteInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static <T> int imprimirArray(T[] arreglo, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= arreglo.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Los límites son inválidos");
        }
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        return limiteSuperior - limiteInferior + 1;
    }
}
