public class Prestamo implements PorPagar{
    private int numeroDeCuotas;
    private double montoDeCuota;

	public int getNumeroDeCuotas() {
		return this.numeroDeCuotas;
	}

	public void setNumeroDeCuotas(int numeroDeCuotas) {
		this.numeroDeCuotas = numeroDeCuotas;
	}

	public double getMontoDeCuota() {
		return this.montoDeCuota;
	}

	public void setMontoDeCuota(double montoDeCuota) {
		this.montoDeCuota = montoDeCuota;
	}

    Prestamo(int numeroDeCuotas, double montoDeCuota) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuota = montoDeCuota;
    }

    @Override
    public double obtenerMontoPago(){
        return numeroDeCuotas*montoDeCuota;
    }

    public String toString() {
    return "Número de Cuotas: " + numeroDeCuotas + "\nMonto de Cuota: " + montoDeCuota;
    }
}
