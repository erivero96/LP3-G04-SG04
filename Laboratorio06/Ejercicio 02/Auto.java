public class Auto implements ImpactoEcologico {
    private double kilometraje;
    private int pasajeros;
    private double DATO_ACTIVIDAD;
    private double FACTOR_DE_EMISION;

    public Auto(double kilometraje, int pasajeros) {
        this.kilometraje = kilometraje;
        this.pasajeros = pasajeros;
        this.FACTOR_DE_EMISION = 0.3; 
    }

    @Override
    public double obtenerImpactoEcologico() {
        DATO_ACTIVIDAD = kilometraje * pasajeros;
        return DATO_ACTIVIDAD * FACTOR_DE_EMISION;
    }

    public double getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getPasajeros() {
        return this.pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
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
        return "Auto: Kilometraje = " + kilometraje + ", Pasajeros = " + pasajeros;
    }
}
