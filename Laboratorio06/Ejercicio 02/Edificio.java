public class Edificio implements ImpactoEcologico {
    private int habitantes;
    private int metrosCuadrados;
    private double DATO_ACTIVIDAD;
    private double FACTOR_DE_EMISION;

    public Edificio(int habitantes, int metrosCuadrados) {
        this.habitantes = habitantes;
        this.metrosCuadrados = metrosCuadrados;
        this.FACTOR_DE_EMISION = 0.5; 
    }

    @Override
    public double obtenerImpactoEcologico() {
        DATO_ACTIVIDAD = habitantes * metrosCuadrados;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }

    public int getHabitantes() {
        return this.habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getMetrosCuadrados() {
        return this.metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
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
        return "Edificio: Habitantes = " + habitantes + ", Metros Cuadrados = " + metrosCuadrados;
    }
}
