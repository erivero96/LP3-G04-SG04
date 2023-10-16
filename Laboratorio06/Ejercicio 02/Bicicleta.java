public class Bicicleta implements ImpactoEcologico {
    private int tiempoUso;
    private double DATO_ACTIVIDAD;
    private double FACTOR_DE_EMISION;

    public Bicicleta(int tiempoUso) {
        this.tiempoUso = tiempoUso;
        this.FACTOR_DE_EMISION = 0.05; 
    }

    @Override
    public double obtenerImpactoEcologico() {
        DATO_ACTIVIDAD = tiempoUso;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }

    public int getTiempoUso() {
        return this.tiempoUso;
    }

    public void setTiempoUso(int tiempoUso) {
        this.tiempoUso = tiempoUso;
    }

    public double getDATO_ACTIVIDAD() {
        return DATO_ACTIVIDAD;
    }

    public double getFACTOR_DE_EMISION() {
        return FACTOR_DE_EMISION;
    }

    public void setFACTOR_DE_EMISION(double factorEmision) {
        this.FACTOR_DE_EMISION = factorEmision;
    }

    @Override
    public String toString() {
        return "Bicicleta: Tiempo de Uso = " + tiempoUso + " días";
    }
}
